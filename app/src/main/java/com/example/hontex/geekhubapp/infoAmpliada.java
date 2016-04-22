package com.example.hontex.geekhubapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;


public class infoAmpliada extends AppCompatActivity {
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadaptor);

        Intent i = getIntent();
        int pos = i.getExtras().getInt("id");
        ListAdaptor holi = new ListAdaptor(this);


        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_listadaptor,null);

        TextView tv = (TextView) findViewById(R.id.tv1);
        ImageView img = (ImageView) findViewById(R.id.img1);
        TextView tv1 = (TextView) findViewById(R.id.tv2);


        tv.setText(holi.text[pos]);
        img.setImageResource(holi.animals[pos]);
        tv1.setText(holi.desc[pos]);




    }

}