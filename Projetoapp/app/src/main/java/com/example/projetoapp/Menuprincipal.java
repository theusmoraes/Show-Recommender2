package com.example.projetoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class Menuprincipal extends AppCompatActivity implements View.OnClickListener  {
    // cuidado onde quando entra aqui
    private static final int RESQUEST_ESTADO =1;
    private static final String STATE_ESTADO = "estado";
    Button botaoestado;
    String estado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
        botaoestado = (Button) findViewById(R.id.button3);
        botaoestado.setOnClickListener(this);
        if(savedInstanceState!=null){
            estado = savedInstanceState.getString(STATE_ESTADO);
            if (estado !=null) botaoestado.setText(estado);
        }
        ImageButton b1= (ImageButton)findViewById(R.id.imageexplorar);
        ImageButton b2= (ImageButton)findViewById(R.id.imageingresso);
        ImageButton b3= (ImageButton)findViewById(R.id.imagedestaque);
        ImageButton b4= (ImageButton)findViewById(R.id.imageperfil);
        ImageButton b5= (ImageButton)findViewById(R.id.imagefavoritos);
        ImageButton b6= (ImageButton)findViewById(R.id.imagesuporte);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explorar =new Intent(Menuprincipal.this,Telaexplorar.class);
                startActivity(explorar);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresso =new Intent(Menuprincipal.this,Telaingressos.class);
                startActivity(ingresso);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent destaque =new Intent(Menuprincipal.this,Teladestaque.class);
                startActivity(destaque);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil =new Intent(Menuprincipal.this,Telaperfil.class);
                startActivity(perfil);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favoritos =new Intent(Menuprincipal.this,Telafavoritos.class);
                startActivity(favoritos);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suporte=new Intent(Menuprincipal.this,Telasuporte.class);
                startActivity(suporte);
            }
        });
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
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

}
