package com.example.projetoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Teladestaque extends AppCompatActivity implements View.OnClickListener{
    // parte 1
    private static final int RESQUEST_ESTADO =1;
    private static final String STATE_ESTADO = "estado";
    Button botaoestado;
    String estado;
    // terminou parte 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladestaque);
        botaoestado = (Button) findViewById(R.id.button3);
        botaoestado.setOnClickListener(this);
        if(savedInstanceState!=null){
            estado = savedInstanceState.getString(STATE_ESTADO);
            if (estado !=null) botaoestado.setText(estado);
        }
        // terminou parte2
        // ALTERANDO

        // TUDO COLOCAD
        // BLOCO 2
        ImageButton b10= (ImageButton)findViewById(R.id.imageButton4);
        ImageButton b11= (ImageButton)findViewById(R.id.imageButton5);
        ImageButton b12= (ImageButton)findViewById(R.id.imageButton6);

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aq =new Intent(Teladestaque.this,Explorar.class);
                startActivity(aq);

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aq =new Intent(Intent.ACTION_VIEW, Uri.parse("https://banco.bradesco/html/classic/index.shtm"));
                startActivity(aq);

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aq =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ingressorapido.com.br/"));
                startActivity(aq);

            }
        });
        // botao menu
        Button botaomenu = (Button) findViewById(R.id.button1);
        botaomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aq =new Intent(Teladestaque.this,Menuprincipal.class);
                startActivity(aq);

            }
        });

        // VAMOS Q VAMOS
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    // parte 3
    @Override
    public void onClick(View view){
        Intent it = new Intent(this, TelaSelecao.class);
        it.putExtra(TelaSelecao.EXTRA_ESTADO, estado);
        startActivityForResult(it, RESQUEST_ESTADO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(resultCode == RESULT_OK && requestCode == RESQUEST_ESTADO){
            estado = data.getStringExtra(TelaSelecao.EXTRA_RESULTADO);
            if(estado != null){
                botaoestado.setText(estado);
            }else{
                botaoestado.setText(R.string.selecionar_estado);
            }
        }
    }

    @Override
    protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STATE_ESTADO, estado);
    }
    //  terminou parte 3
}
