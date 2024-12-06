package com.example.matefinanc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {

    Button IS, IC, An, Am, De;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        IS = findViewById(R.id.IS);
        IC = findViewById(R.id.IC);
        An = findViewById(R.id.An);
        Am = findViewById(R.id.Am);
        De = findViewById(R.id.De);

        IS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IntSim.class);
                startActivity(i);
            }
        });

        IC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IntComp.class);
                startActivity(i);
            }
        });

        An.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), menu_anualidades.class);
                startActivity(i);
            }
        });

        De.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_si.class);
                startActivity(i);
            }
        });

        Am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Amort.class);
                startActivity(i);
            }
        });
    }
}