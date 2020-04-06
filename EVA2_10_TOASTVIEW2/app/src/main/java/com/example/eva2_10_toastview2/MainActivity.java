package com.example.eva2_10_toastview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showCustomToast(View v){
        // /////////////////////////////////////////////////
// this fragment creates a custom Toast showing
// image + text + shaped_background
        // triggered by XML button's android:onClick=...
        Toast customToast = makeCustomToast(this);
        customToast.show();
    }

    protected Toast makeCustomToast(Context context) {
// Reference:
// http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate( R.layout.custom_toast, null);
        TextView text = (TextView) layout.findViewById(R.id.toast_text);
        text.setText("This is a custom toast");

        Toast toast = new Toast(context);
        toast.setMargin(50,-50); //lower-right corner
        toast.setDuration(Toast.LENGTH_LONG);

        toast.setView(layout);

        return toast;
    }//makeCustomToast

}
