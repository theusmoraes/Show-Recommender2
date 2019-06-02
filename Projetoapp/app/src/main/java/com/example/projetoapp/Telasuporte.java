package com.example.projetoapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Telasuporte extends AppCompatActivity  implements View.OnClickListener {
    // parte 1
    private static final int RESQUEST_ESTADO =1;
    private static final String STATE_ESTADO = "estado";
    Button botaoestado;
    String estado;
    // terminou parte 1
       Button botaoavaliar,botaocentral,botaosobre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telasuporte);
        botaoestado = (Button) findViewById(R.id.button3);
        botaoestado.setOnClickListener(this);
        if(savedInstanceState!=null){
            estado = savedInstanceState.getString(STATE_ESTADO);
            if (estado !=null) botaoestado.setText(estado);
        }
        // terminou parte2
        final Intent web= new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store?hl=pt-BR&tab=w8"));
        botaoavaliar = (Button)findViewById(R.id.avaliar);
        botaoavaliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(web);
            }
        });

        final Intent web1= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/"));
        botaocentral = (Button)findViewById(R.id.central);
        botaocentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(web1);
            }
        });


        final Intent web2= new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/studio/intro?hl=pt-br"));
        botaosobre = (Button)findViewById(R.id.sobre);
        botaosobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(web2);
            }
        });
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // ALTERANDO
        ImageButton b7= (ImageButton)findViewById(R.id.tui);
        ImageButton b8= (ImageButton)findViewById(R.id.face);
        ImageButton b9= (ImageButton)findViewById(R.id.insta);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuie =new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/?lang=pt"));
                startActivity(tuie);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facee =new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt-br.facebook.com/"));
                startActivity(facee);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inst =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/?hl=pt-br"));
                startActivity(inst);

            }
        });
        // TUDO COLOCAD

        // BLOCO 2
        ImageButton b10= (ImageButton)findViewById(R.id.imageButton4);
        ImageButton b11= (ImageButton)findViewById(R.id.imageButton5);
        ImageButton b12= (ImageButton)findViewById(R.id.imageButton6);

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aq =new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/"));
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
                Intent aq =new Intent(Telasuporte.this,Menuprincipal.class);
                startActivity(aq);

            }
        });

        // VAMOS Q VAMOS
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
