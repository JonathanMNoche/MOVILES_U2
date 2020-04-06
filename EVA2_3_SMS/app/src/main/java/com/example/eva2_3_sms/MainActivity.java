package com.example.eva2_3_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent inSMS;
    Button btnEnviarSMS;
    EditText edtTextTel, edtTextMen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTextMen = findViewById(R.id.edtTextMen);
        edtTextTel = findViewById(R.id.edtTextTel);
        btnEnviarSMS = findViewById(R.id.btnEnviarSMS);
        btnEnviarSMS.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String tel, men;
                        tel = "smsto:" + edtTextTel.getText().toString();
                        men = edtTextMen.getText().toString();
                        inSMS = new Intent(Intent.ACTION_SENDTO, Uri.parse(tel));
                        inSMS.putExtra("sms_body", men);
                        startActivity(inSMS);
                    }
                }
        );
    }


}
