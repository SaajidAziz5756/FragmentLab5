//Saajid Aziz   n01555756
package com.example.fragmenttry;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class SaajidActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                aDialog();
            }
        };

        getOnBackPressedDispatcher().addCallback(this, callback);
    }


    public void aDialog() {
        new AlertDialog.Builder(SaajidActivity5.this)
                .setIcon(R.drawable.ic_launcher_background)
                .setMessage("Would you like to exit the app?")
                .setTitle(getString(R.string.app_name))
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which ) {finishAffinity();}
                })
                .setNegativeButton("No", null)
                .setCancelable(false)
                .show();

    }
}
