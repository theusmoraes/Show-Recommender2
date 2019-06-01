package com.example.projetoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Paginadelogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginadelogin);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Button botaologin= findViewById(R.id.login);
        botaologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent login = new Intent(Paginadelogin.this,Menuprincipal.class);
               startActivity(login);
            }
        });



    }


}
