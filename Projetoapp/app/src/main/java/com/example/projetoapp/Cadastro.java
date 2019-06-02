package com.example.projetoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Cadastro extends AppCompatActivity implements View.OnClickListener {
    Button b8;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        b8 = (Button)findViewById(R.id.btnSalvar);
        b8.setOnClickListener(this);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSalvar){
            Intent z = new Intent(this, Menuprincipal.class);
            startActivity(z);
        }
    }
}
