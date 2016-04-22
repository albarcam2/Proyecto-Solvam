package com.example.hontex.geekhubapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class menu_2 extends AppCompatActivity {

    ListView list;
    ListAdaptor posi = new ListAdaptor(this);
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuxml);
        getIntent();
        list= (ListView)findViewById(R.id.lv1);

        list.setAdapter(new ListAdaptor(this));
        i = new Intent(this, infoAmpliada.class);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                i.putExtra("id", position);
                startActivity(i);

            }
        });
    }
}