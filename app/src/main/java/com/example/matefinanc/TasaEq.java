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

public class TasaEq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tasa_eq);

        EditText n, n1, p, p1, i, i1;
        TextView TE;
        Button calc, btn_regresar, btn_menu;

        n = findViewById(R.id.n);
        n1 = findViewById(R.id.n2);
        p = findViewById(R.id.p);
        p1 = findViewById(R.id.p2);
        i = findViewById(R.id.i);
        i1 = findViewById(R.id.i2);
        TE = findViewById(R.id.TE);
        btn_regresar = findViewById(R.id.Regresar);
        btn_menu = findViewById(R.id.Menu);
        calc = findViewById(R.id.calc);


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

                Double n0 = Double.parseDouble(n.getText().toString());
                Double m = Double.parseDouble(n1.getText().toString());
                Double p0 = Double.parseDouble(p.getText().toString());
                Double q = Double.parseDouble(p1.getText().toString());
                Double i0 = Double.parseDouble(i.getText().toString());
                Double j = Double.parseDouble(i1.getText().toString());

                double opc = m;

                TE.setText("La opción 1 tiene "+i0+"% mientras que la opción 2 tiene "+opc+"%");

            }
        });

    }
}