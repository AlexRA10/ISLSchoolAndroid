package com.example.isl_schools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.isl_schools.dao.EscolaDao;

public class ListaEscola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_escola);

    }

    @Override
    protected void onResume(){
        super.onResume();

        ListView listaEscolas = findViewById(R.id.listaEscolas);

        EscolaDao dao = new EscolaDao();

        listaEscolas.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.all()));
    }
}
