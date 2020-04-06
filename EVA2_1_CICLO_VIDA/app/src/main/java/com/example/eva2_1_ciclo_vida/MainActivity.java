package com.example.eva2_1_ciclo_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mensaje("On Create");
    }

    public void Mensaje(String mensa){
        Toast.makeText(this, mensa, Toast.LENGTH_SHORT).show();
        Log.wtf("APP", mensa);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Mensaje("On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Mensaje("On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Mensaje("On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Mensaje("On Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Mensaje("On Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Mensaje("On Destroy");
    }
}
