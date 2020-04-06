package com.example.eva2_7_bundles_extra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        datos = findViewById(R.id.datos);
        Intent inDatos = getIntent();
        String texto = inDatos.getStringExtra("un gato");
        Bundle stringBundle = inDatos.getExtras();
        datos.setText(texto);
        datos.append("\n");
        datos.append(stringBundle.getString("usingBundle"));
    }
}
