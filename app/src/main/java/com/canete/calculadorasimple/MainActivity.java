package com.canete.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.btnSumar).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivitySumar.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnRestar).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivityRestar.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnMultiplicar).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivityMultiplicar.class);
            startActivity(ventana);
        });

        findViewById(R.id.btnDividir).setOnClickListener(v-> {
            Intent ventana = new Intent(MainActivity.this, ActivityDividir.class);
            startActivity(ventana);
        });



        //Toast.makeText(this, "Añadir", Toast.LENGTH_LONG).show();
    }


}