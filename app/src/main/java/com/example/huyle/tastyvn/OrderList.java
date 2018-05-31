package com.example.huyle.tastyvn;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by minh thanh on 5/30/2018.
 */

public class OrderList extends ArrayAdapter<String> {
    private final Activity context;
    String[] foodname = new String[15];
    String[] image = new String[15];
    String[] quality = new String[15];
    String[] price = new String[15];


    public OrderList(Activity context,String[] foodname,String[] image,String[] price,String[] quality)
    {
        super(context,R.layout.activity_list,foodname);
        this.context = context;
        this.foodname = foodname;

        this.image = image;
        this.quality = quality;
        this.price= price;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater= context.getLayoutInflater();
        View v =inflater.inflate(R.layout.activity_list, null,true);

        TextView viewName = v.findViewById(R.id.item);
        TextView viewQuality = v.findViewById(R.id.quantity);

        TextView viewPrice = v.findViewById(R.id.price);
        ImageView viewFood = v.findViewById(R.id.icon);

        viewName.setText(""+foodname[position].toString());
        viewQuality.setText("Quantity: "+quality[position].toString());
        viewPrice.setText("Prices: "+price[position].toString()+"$");
        Picasso.with(context).load(image[position].toString()).into(viewFood);

        return v;

    };

}
