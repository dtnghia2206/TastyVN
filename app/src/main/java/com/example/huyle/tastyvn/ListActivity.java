package com.example.huyle.tastyvn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.huyle.tastyvn.Model.Request;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ListActivity extends AppCompatActivity {


    String table_address;
    ListView list;
    int count;
    String[] foodname ;
    String[] image ;
    String[] quality ;
    String[] price ;

    int i;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.exitlistmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {

            Intent i = new Intent(ListActivity.this,MainActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listorder);
        Bundle dataReceive = getIntent().getExtras();
        if(dataReceive!=null) {
            table_address = dataReceive.getString("table_address");
        }

        FirebaseDatabase.getInstance().getReference().child("Requests")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            Request request = snapshot.getValue(Request.class);
                            if( request.getAddress().toString().equals(table_address)) {
                                count = (int) snapshot.child("foods").getChildrenCount();
                                foodname = new String[count];
                                image = new String[count];
                                quality = new String[count];
                                price = new String[count];

                                for (i = 0; i < count; i++) {

                                    image[i] = snapshot.child("foods").child(String.valueOf(i)).child("image").getValue().toString();
                                    foodname[i] = snapshot.child("foods").child(String.valueOf(i)).child("productName").getValue().toString();
                                    quality[i] = snapshot.child("foods").child(String.valueOf(i)).child("quantity").getValue().toString();
                                    price[i] = snapshot.child("foods").child(String.valueOf(i)).child("price").getValue().toString();
                                }
                            }
                        }

                        OrderList adapter = new OrderList(ListActivity.this, foodname, image, price, quality);
                        list = (ListView) findViewById(R.id.list);
                        list.setAdapter(adapter);

                        DatabaseReference mDatabase;
                        mDatabase = FirebaseDatabase.getInstance().getReference();
                        mDatabase.child("Requests").child(table_address).child("status").setValue("1");
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
    }
}
