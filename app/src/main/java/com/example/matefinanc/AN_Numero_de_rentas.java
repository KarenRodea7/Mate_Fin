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

public class AN_Numero_de_rentas extends AppCompatActivity {

    EditText M, IT, RT, P;
    TextView MONT;
    Button calc, btn_regresar, btn_menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_an_numero_de_rentas);


        M = findViewById(R.id.M);
        IT = findViewById(R.id.it);
        RT = findViewById(R.id.RT);
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
                Double m = Double.parseDouble(M.getText().toString());
                Double i = Double.parseDouble(IT.getText().toString());
                Double r = Double.parseDouble(RT.getText().toString());
                Double p = Double.parseDouble(P.getText().toString());

                double cap = Math.log(((m/(r*(1+((i/100)/p))))*((i/100)/p)+1))/Math.log(1+((i/100)/p));
                MONT.setText(""+cap);

            }
        });
    }
}