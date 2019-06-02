package com.example.projetoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    // tela de escolha
    private ImageButton imagenbutao;
    Button botao1,botao2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        botao1 = (Button)findViewById(R.id.button2);
        botao1.setOnClickListener(this);

        botao2 = (Button)findViewById(R.id.button);
        botao2.setOnClickListener(this);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Intent i = new Intent(this, Paginadelogin.class);
                startActivity(i);
                break;
            case R.id.button:
                Intent d = new Intent(this, Cadastro.class);
                startActivity(d);
                break;
        }
    }
}
