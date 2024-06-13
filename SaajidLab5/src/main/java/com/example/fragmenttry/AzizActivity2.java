package com.example.fragmenttry;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class AzizActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_aziz2);

        TextView txt = findViewById(R.id.SaajidDate);
        DatePicker dp = findViewById(R.id.SaajiddatePicker);

        Calendar cal = Calendar.getInstance();
        dp.init(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        String day = (" "+monthOfYear+ " / "+ dayOfMonth + " / "+year);
                        txt.setText(day);
                    }
                } );




    }
}