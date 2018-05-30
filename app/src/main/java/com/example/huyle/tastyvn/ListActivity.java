package com.example.huyle.tastyvn;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.huyle.tastyvn.Model.Request;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ListActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference category;
    String table_address;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Bundle dataReceive = getIntent().getExtras();
        if(dataReceive!=null) {
            table_address = dataReceive.getString("table_address");
        }
    }
}
