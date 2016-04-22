package com.example.hontex.geekhubapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent loginIntent;
    Button bLogin;
    EditText username;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.pass);
        bLogin=(Button)findViewById(R.id.button);

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               loginIntent=new Intent(MainActivity.this,menu_2.class);

                if(username.getText().toString().equals("Solvam") && pass.getText().toString().equals("1234")){
                    startActivity(loginIntent);
                }else{
                    Toast t1 = Toast.makeText(getApplicationContext(),
                            "Login Incorrecto", Toast.LENGTH_LONG);
                    t1.show();
                    username.setText("");
                    pass.setText("");
                }
            }
        });


    }
}
