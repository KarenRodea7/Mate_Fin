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

public class des_si extends AppCompatActivity {
    Button Me, M, PA, TD, D, VC, Reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_des_si);

        Me = findViewById(R.id.d_m);
        M = findViewById(R.id.d_m);
        Reg = findViewById(R.id.comp_Regresar);
        PA = findViewById(R.id.d_pa);
        D = findViewById(R.id.d);
        TD = findViewById(R.id.D_td);
        VC = findViewById(R.id.v_c);

        Me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_si.class);
                startActivity(i);
            }
        });

        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_monto.class);
                startActivity(i);
            }
        });

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
            }
        });

        PA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_plazo_ant.class);
                startActivity(i);
            }
        });

        TD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_tasa_des.class);
                startActivity(i);
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_desc.class);
                startActivity(i);
            }
        });

        VC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), des_ValCom.class);
                startActivity(i);
            }
        });


    }
}