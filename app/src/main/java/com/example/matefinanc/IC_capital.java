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

public class IC_capital extends AppCompatActivity {
    EditText M, IT, N, P;
    TextView CAP;
    Button calc, btn_regresar, btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ic_capital);

        M = findViewById(R.id.m);
        IT = findViewById(R.id.i);
        N = findViewById(R.id.n);
        CAP = findViewById(R.id.cap);
        calc = findViewById(R.id.calc);
        btn_regresar = findViewById(R.id.Regresar);
        btn_menu = findViewById(R.id.Menu);
        P = findViewById(R.id.comp_p);

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
                Double m = Double.parseDouble(M.getText().toString());
                Double i = Double.parseDouble(IT.getText().toString());
                Double n = Double.parseDouble(N.getText().toString());
                Double p = Double.parseDouble(P.getText().toString());

                double cap = m/Math.pow((1+((i/100)/p)),((n/12)*p));
                CAP.setText(""+cap);

            }
        });
    }
}