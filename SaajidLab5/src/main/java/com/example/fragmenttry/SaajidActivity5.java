//Saajid Aziz   n01555756
package com.example.fragmenttry;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.RequestPermission;

import android.Manifest;
import android.content.pm.PackageManager;
import android.provider.MediaStore;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

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
                .setIcon(R.drawable.ic_launcher_foreground)
                .setMessage(R.string.would_you_like_to_exit_the_app)
                .setTitle(getString(R.string.app_name))
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which ) {finishAffinity();}
                })
                .setNegativeButton(R.string.no, null)
                .setCancelable(false)
                .show();

    }
    public void updateDefinition(String concepts, String definitions){
        DefinitionFragmentSaajid desc = (DefinitionFragmentSaajid) getSupportFragmentManager().findFragmentById(R.id.SaajidfragmentContainerView2);
       if (desc != null)
        desc.updateDef(concepts, definitions);



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
            startActivity(i);

            return true;
        }
        if (Id == R.id.SaajidAction) {


        } else if (Id == R.id.Saajidcall) {


            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
            {


               dialNumb();

            } else{
                requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE);

            }



            return true;
        }else if (Id == R.id.Saajidcamera) {
            Intent in = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(in);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private final ActivityResultLauncher<String> requestPermissionLauncher =
            registerForActivityResult(new RequestPermission(), isGranted -> {
                if (isGranted) {
                   dialNumb();
                } else {
                    Toast.makeText(this, R.string.saajid_aziz_permission_denied, Toast.LENGTH_SHORT).show();
                }
            });
    private void dialNumb()
    {
        Intent dial = new Intent(Intent.ACTION_CALL);
        dial.setData(Uri.parse("tel:6478294715"));
        startActivity(dial);
    }
}
