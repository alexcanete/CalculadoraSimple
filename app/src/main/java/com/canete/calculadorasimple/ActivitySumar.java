package com.canete.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ActivitySumar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);

        EditText lblN1 = findViewById(R.id.lblN1);
        EditText lblN2 = findViewById(R.id.lblN2);

        findViewById(R.id.btnCalcular).setOnClickListener(v-> {
            String sN1 = lblN1.getText().toString();
            String sN2 = lblN2.getText().toString();
        });
    }
}