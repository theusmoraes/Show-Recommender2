package com.example.projetoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    // Tela de Carregamento
    private ImageButton imagenbutao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
getSupportActionBar().hide();
getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

   new Handler().postDelayed(new Runnable() {
       @Override
       public void run() {
           startActivity(new Intent(getBaseContext(),Menu.class));
           finish();
       }
   },5000);
    }
}
