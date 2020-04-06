package com.example.eva2_8_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent Res, Contactos, imagen, audio, video;
    final int restaurante = 1000;
    final int Contacto = 2000;
    final int Imagen = 3000;
    final int Dolby = 4000;
    final int Video = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Res = new Intent(this, MyDataActivity.class);
        Contactos = new Intent(Intent.ACTION_PICK, android.provider.ContactsContract.Contacts.CONTENT_URI);
        imagen = new Intent (Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        audio = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        video = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI );
    }
//android.provider.ContactsContract.Contacts.CONTENT_URI
    public void onClick (View v){
        startActivityForResult(Res, restaurante);
    }

    public void onClic(View v){
        startActivityForResult(Contactos, Contacto);
    }

    public void Imagen(View v){
        startActivityForResult(imagen, Imagen);
    }

    public void Audio(View v){
        startActivityForResult(audio, Dolby);
    }

    public void Video(View v){
        startActivityForResult(video, Video);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case restaurante: //Que eactividad devuelve los datos
                if (resultCode == Activity.RESULT_OK){
                    //Que accion ejecutan con los datos devueltos
                    Toast.makeText(this, data.getStringExtra("tag"), Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "CANCELADO POR EL USUARIO", Toast.LENGTH_SHORT).show();
                }
                break;
                default:

            case Contacto:
                if (resultCode == Activity.RESULT_OK){
                    String sCont = data.getDataString();
                    Log.wtf("Contacto", sCont);
                    Toast.makeText(this, sCont, Toast.LENGTH_SHORT).show();
                }
                break;

            case Imagen:
                if (resultCode == Activity.RESULT_OK){
                    String sCont = data.getDataString();
                    Log.wtf("Imagen", sCont);
                    Toast.makeText(this, sCont, Toast.LENGTH_SHORT).show();
                }
                break;

            case Dolby:
                if (resultCode == Activity.RESULT_OK){
                    String sCont = data.getDataString();
                    Log.wtf("Audio", sCont);
                    Toast.makeText(this, sCont, Toast.LENGTH_SHORT).show();
                }
                break;

            case Video:
                if (resultCode == Activity.RESULT_OK){
                    String sCont = data.getDataString();
                    Log.wtf("Video", sCont);
                    Toast.makeText(this, sCont, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
