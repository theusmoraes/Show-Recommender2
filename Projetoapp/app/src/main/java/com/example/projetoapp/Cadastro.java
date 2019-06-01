package com.example.projetoapp;

import android.content.Intent;
<<<<<<< HEAD
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
>>>>>>> main
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Cadastro extends AppCompatActivity {
<<<<<<< HEAD
    Button b1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final Intent i= new Intent(Cadastro.this,Paginadelogin.class);
        b1 = (Button)findViewById(R.id.btnSalvar);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
=======
    // tela de Cadastro
    Button b8;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        final Intent z= new Intent(Cadastro.this,Paginadelogin.class);
        b8 = (Button)findViewById(R.id.btnSalvar);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(z);
>>>>>>> main
            }
        });
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
