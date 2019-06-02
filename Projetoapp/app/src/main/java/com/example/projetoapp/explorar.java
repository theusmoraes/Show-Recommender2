package com.example.projetoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class explorar extends AppCompatActivity implements View.OnClickListener {
    Button botao1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorar);
        botao1 = (Button)findViewById(R.id.btnexplorar);
        botao1.setOnClickListener(this);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnexplorar:
                Intent i = new Intent(this, Telaexplorar.class);
                startActivity(i);
                break;
        }
    }
}
