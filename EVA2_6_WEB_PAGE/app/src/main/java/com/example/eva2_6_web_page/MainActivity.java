package com.example.eva2_6_web_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent page;
    EditText edtTextWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTextWeb = findViewById(R.id.edtTextWeb);
    }

    public void onClick(View v){
        String pag = edtTextWeb.getText().toString();
        page = new Intent(Intent.ACTION_VIEW, Uri.parse(pag));
        startActivity(page);
    }

}
