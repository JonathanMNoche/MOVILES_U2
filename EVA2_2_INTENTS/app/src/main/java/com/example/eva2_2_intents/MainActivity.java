package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inTel;
    EditText edtTextTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTextTel = findViewById(R.id.edtTextTel);

    }

    public void onClick(View v){
        String cade = "tel:" + edtTextTel.getText().toString();
        inTel = new Intent(Intent.ACTION_CALL, Uri.parse(cade));
        startActivity(inTel);
    }
}
