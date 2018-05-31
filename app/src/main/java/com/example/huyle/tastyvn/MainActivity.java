package com.example.huyle.tastyvn;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.huyle.tastyvn.Model.Request;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    FirebaseDatabase database;
    int data1,data2,data3,data4,data5,data6,data7,data8,data9,data10;
    TextView txtView;
    Button table1;
    Button table2;
    Button table3;
    Button table4;
    Button table5;
    Button table6;
    Button table7;
    Button table8;
    Button table9;
    Button table10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //txtView = (TextView)findViewById(R.id.txtView);
        table1 = (Button)findViewById(R.id.table1);
        table1.setOnClickListener(this);
        table2 = (Button)findViewById(R.id.table2);
        table2.setOnClickListener(this);
        table3 = (Button)findViewById(R.id.table3);
        table3.setOnClickListener(this);
        table4 = (Button)findViewById(R.id.table4);
        table4.setOnClickListener(this);
        table5 = (Button)findViewById(R.id.table5);
        table5.setOnClickListener(this);
        table6 = (Button)findViewById(R.id.table6);
        table6.setOnClickListener(this);
        table7 = (Button)findViewById(R.id.table7);
        table7.setOnClickListener(this);
        table8 = (Button)findViewById(R.id.table8);
        table8.setOnClickListener(this);
        table9 = (Button)findViewById(R.id.table9);
        table9.setOnClickListener(this);
        table10 = (Button)findViewById(R.id.table10);
        table10.setOnClickListener(this);


        FirebaseDatabase.getInstance().getReference().child("Requests")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                            Request request = snapshot.getValue(Request.class);

                            if(request.getAddress().equals("1")) {
                                table1.setBackgroundColor(Color.RED);
                                data1 = 1;
                            }
                            if(request.getAddress().equals("2")) {
                                table2.setBackgroundColor(Color.RED);
                                data2 = 1;
                            }
                            if(request.getAddress().equals("3")) {
                                table3.setBackgroundColor(Color.RED);
                                data3 = 1;
                            }
                            if(request.getAddress().equals("4")) {
                                table4.setBackgroundColor(Color.RED);
                                data4 = 1;
                            }
                            if(request.getAddress().equals("5")) {
                                table5.setBackgroundColor(Color.RED);
                                data5 = 1;
                            }
                            if(request.getAddress().equals("6")) {
                                table6.setBackgroundColor(Color.RED);
                                data6 = 1;
                            }
                            if(request.getAddress().equals("7")) {
                                table7.setBackgroundColor(Color.RED);
                                data7 = 1;
                            }
                            if(request.getAddress().equals("8")) {
                                table8.setBackgroundColor(Color.RED);
                                data8 = 1;
                            }
                            if(request.getAddress().equals("9")) {
                                table9.setBackgroundColor(Color.RED);
                                data9 = 1;
                            }
                            if(request.getAddress().equals("10")) {
                                table10.setBackgroundColor(Color.RED);
                                data10 = 1;
                            }
                        }
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.table1) {
            if(data1 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","1");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table2) {
            if(data2 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","2");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table3) {
            if(data3 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","3");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table4) {
            if(data4 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","4");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table5) {
            if(data5 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","5");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table6) {
            if(data6 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","6");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table7) {
            if(data7 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","7");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table8) {
            if(data8 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","8");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table9) {
            if(data9 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","9");
                startActivity(i);
            }
        }
        if (v.getId() == R.id.table10) {
            if(data10 == 1) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                i.putExtra("table_address","10");
                startActivity(i);
            }
        }
    }
}
