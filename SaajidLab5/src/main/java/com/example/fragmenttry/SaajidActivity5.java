//Saajid Aziz   n01555756
package com.example.fragmenttry;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int Id = item.getItemId();
        if (Id == R.id.Saajidhelp) {

            Intent i = new Intent(SaajidActivity5.this, AzizActivity2.class);


            return true;
        }
        if (Id == R.id.SaajidAction) {


        } else if (Id == R.id.Saajidcall) {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:6478194715"));
            startActivity(dialIntent);
            return true;
        }else if (Id == R.id.Saajidcamera) {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:6478194715"));
            startActivity(dialIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
