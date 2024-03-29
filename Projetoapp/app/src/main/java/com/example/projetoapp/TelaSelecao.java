package com.example.projetoapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

public class TelaSelecao  extends ListActivity {
    // cuidado onde quando entra aqui lista de quando eu coloquei o estado

    public static final String EXTRA_ESTADO = "estado";
    public static final String EXTRA_RESULTADO ="result";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] estados = getResources().getStringArray(R.array.estados);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice, estados));
        String estado = getIntent().getStringExtra(EXTRA_ESTADO);
        if(estado !=null){
            int position = Arrays.asList(estados).indexOf(estado);
            getListView().setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
            getListView().setItemChecked(position, true);
        }
        //setContentView(R.layout.activity_tela_selecao);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        String result = l.getItemAtPosition(position).toString();
        Intent it = new Intent();
        it.putExtra(EXTRA_RESULTADO, result);
        setResult(RESULT_OK, it);
        finish();
    }
}
