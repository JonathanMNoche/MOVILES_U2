package com.example.eva2_7_bundles_extra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnEnviar;
    EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtNombre = findViewById(R.id.txtNombre);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("usingBundle", nombre);
                Intent intent = new Intent(getApplicationContext(), SecondaryActivity.class);
                intent.putExtra("un gato", nombre);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

}
