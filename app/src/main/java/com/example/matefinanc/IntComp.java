package com.example.matefinanc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntComp extends AppCompatActivity {

    Button C, M, TI, P, I, btn_regresar, PC, TE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_comp);

        C = findViewById(R.id.comp_c);
        M = findViewById(R.id.comp_m);
        TI = findViewById(R.id.comp_it);
        P = findViewById(R.id.comp_n);
        PC = findViewById(R.id.comp_np);
        I = findViewById(R.id.comp_i);
        TE = findViewById(R.id.TE);
        btn_regresar = findViewById(R.id.comp_Regresar);


        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogoCapC();
            }
        });

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogoMonC();
            }
        });

        TI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IC_TazaInteres.class);
                startActivity(i);
            }
        });

        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), IC_plazo.class);
                startActivity(i);
            }
        });


        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu.class);
                startActivity(intent);
            }
        });

        PC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IC_Peri.class);
                startActivity(intent);
            }
        });

        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), des_intereses.class);
                startActivity(intent);
            }
        });

    }

    private void DialogoCapC() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //builder.setTitle("Eliminar");
        builder.setMessage("¿Conoces el valor de los Intereses?");

        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), Capital_IC.class);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), IC_capital.class);
                startActivity(intent);
            }
        });

        builder.show();

    }

    private void DialogoMonC() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //builder.setTitle("Eliminar");
        builder.setMessage("¿Conoces el valor de los Intereses?");

        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), Monto_IC.class);
                startActivity(intent);
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), IC_monto.class);
                startActivity(intent);
            }
        });

        builder.show();

    }
}