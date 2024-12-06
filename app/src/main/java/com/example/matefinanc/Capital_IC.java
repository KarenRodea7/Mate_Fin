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

public class Capital_IC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_capital_ic);

        EditText C, M;
        TextView I;
        Button calc, btn_regresar, btn_menu;

        C = findViewById(R.id.c);
        M = findViewById(R.id.m);
        I = findViewById(R.id.I);
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
                Double c = Double.parseDouble(C.getText().toString());
                Double m = Double.parseDouble(M.getText().toString());

                double Cap = c-m;
                I.setText(""+Cap);

            }
        });
    }
}