package com.example.projetoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    // tela de escolha
    private ImageButton imagenbutao;
<<<<<<< HEAD
    Button botao1;
    Button botao2;
=======
    Button botao1,botao2;
>>>>>>> main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
            final Intent i= new Intent(Menu.this,Paginadelogin.class);
            botao1 = (Button)findViewById(R.id.button2);
            botao1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(i);
                }
            });
        final Intent d= new Intent(Menu.this,Cadastro.class);
        botao2 = (Button)findViewById(R.id.button);
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(d);
            }
        });


            final Intent x= new Intent(Menu.this,Cadastro.class);
            botao2 = (Button)findViewById(R.id.button);
            botao2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(x);
                }
            });


            getSupportActionBar().hide();
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}
