package com.example.matefinanc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IC_plazo extends AppCompatActivity {

    EditText capi, IT, N, M;
    TextView Plaz;
    Button calc, btn_regresar, btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ic_plazo);

        M = findViewById(R.id.m);
        IT = findViewById(R.id.i);
        capi = findViewById(R.id.capi);
        Plaz = findViewById(R.id.plazo);
        calc = findViewById(R.id.calc);
        btn_regresar = findViewById(R.id.Regresar);
        btn_menu = findViewById(R.id.Menu);

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IntComp.class);
                startActivity(i);
            }
        });

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double c = Double.parseDouble(capi.getText().toString());
                Double i = Double.parseDouble(IT.getText().toString());
                Double m = Double.parseDouble(M.getText().toString());

                double cap = ((Math.log(m/c))/Math.log(1+i/100))*12;
                Plaz.setText(""+cap+" meses");

            }
        });

    }
}