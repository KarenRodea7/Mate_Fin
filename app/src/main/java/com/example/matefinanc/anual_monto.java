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

public class anual_monto extends AppCompatActivity {
    EditText r, IT, N, P;
    TextView MONT;
    Button calc, btn_regresar, btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anual_monto);

        r = findViewById(R.id.r);
        IT = findViewById(R.id.it);
        N = findViewById(R.id.n);
        MONT = findViewById(R.id.monto);
        calc = findViewById(R.id.calc);
        btn_regresar = findViewById(R.id.Regresar);
        btn_menu = findViewById(R.id.Menu);
        P = findViewById(R.id.renta_p);

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), menu_anualidades.class);
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
                Double R = Double.parseDouble(r.getText().toString());
                Double i = Double.parseDouble(IT.getText().toString());
                Double n = Double.parseDouble(N.getText().toString());
                Double p = Double.parseDouble(P.getText().toString());

                double cap = (R*(1+(i/100)/p))*(Math.pow((1+(i/100)/p),((n/12)*p))-1)/((i/100)/p);
                MONT.setText(""+cap);

            }
        });
    }
}
