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

public class IC_TazaInteres extends AppCompatActivity {
    EditText Cap, monto, N, P;
    TextView It;
    Button calc, btn_regresar, btn_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ic_taza_interes);

        Cap = findViewById(R.id.TazaInteres);
        monto = findViewById(R.id.monto);
        N = findViewById(R.id.n);
        It = findViewById(R.id.cap);
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
                Double c = Double.parseDouble(Cap.getText().toString());
                Double m = Double.parseDouble(monto.getText().toString());
                Double n = Double.parseDouble(N.getText().toString());
                Double p = Double.parseDouble(P.getText().toString());

                double cap = ((Math.pow((m/c),(1/((n/12)*p)))-1)*p)*100;
                It.setText(""+cap+" %");

            }
        });
    }

}
