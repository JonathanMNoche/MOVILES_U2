package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MyDataActivity extends AppCompatActivity implements ListView.OnItemClickListener, View.OnClickListener {

    ListView lstVwMostrar;
    String [] Restaurantes = {
            "McDonalds",
            "Pollo Feliz",
            "Dominos",
            "Burguer King",
            "Tortas Piolin",
            "Hakuna",
            "KFC"
    };

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_data);
        lstVwMostrar = findViewById(R.id.lstVwMostrar);
        lstVwMostrar.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Restaurantes));
        button = findViewById(R.id.button);
        lstVwMostrar.setOnItemClickListener(this);
        button.setOnClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent inDatos = new Intent();
        inDatos.putExtra("tag", Restaurantes[position]);
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }

    @Override
    public void onClick(View v) {

        finish();
    }
}
