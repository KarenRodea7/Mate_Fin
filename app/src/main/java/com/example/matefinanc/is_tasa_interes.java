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

public class is_tasa_interes extends AppCompatActivity {
    EditText C, M, N;
    TextView IT;
    Button calc, btn_regresar, btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_tasa_interes);

        C = findViewById(R.id.c);
        M = findViewById(R.id.m);
        N = findViewById(R.id.n);
        IT = findViewById(R.id.i);
        calc = findViewById(R.id.calc);
        btn_regresar = findViewById(R.id.Regresar);
        btn_menu = findViewById(R.id.Menu);

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IntSim.class);
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
                Double n = Double.parseDouble(N.getText().toString());

                double tain = ((m/c-1)/(n/12))*100;
                IT.setText(""+tain+" %");

            }
        });

    }
}
