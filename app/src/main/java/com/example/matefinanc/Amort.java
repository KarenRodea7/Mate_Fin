package com.example.matefinanc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TableLayout;
import android.widget.TableRow;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Amort extends AppCompatActivity {

    EditText S, NR, I, P;
    Button C, Reg;
    TableLayout TA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_amort);

        S = findViewById(R.id.S);
        NR = findViewById(R.id.nr);
        I = findViewById(R.id.i);
        P = findViewById(R.id.p);
        C = findViewById(R.id.calc);
        Reg = findViewById(R.id.Regresar);
        TA = findViewById(R.id.TA);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Menu.class);
                startActivity(i);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double saldo = Double.parseDouble(S.getText().toString());
                double interes = Double.parseDouble(I.getText().toString());
                int periodo = Integer.parseInt(P.getText().toString());
                int rentas = Integer.parseInt(NR.getText().toString());

                calcularAmortizacion(saldo, interes, periodo, rentas);

            }
        });

    }

    private void calcularAmortizacion(double saldo, double interes, int periodo, int rentas) {
        // Limpia el TableLayout antes de rellenarlo
        TA.removeAllViews();

        // Agrega la cabecera de la tabla
        TableRow header = new TableRow(this);
        addCellToRow(header, "Renta No.", true);
        addCellToRow(header, "Renta", true);
        addCellToRow(header, "Intereses", true);
        addCellToRow(header, "Amortización", true);
        addCellToRow(header, "Saldo insoluto", true);
        TA.addView(header);

        TableRow initialRow = new TableRow(this);
        addCellToRow(initialRow, "0", false);                      // Renta No.
        addCellToRow(initialRow, "-", false);                     // Renta
        addCellToRow(initialRow, "-", false);                     // Intereses
        addCellToRow(initialRow, "-", false);                     // Amortización
        addCellToRow(initialRow, String.format("%.2f", saldo), false); // Saldo inicial
        TA.addView(initialRow);

        // Calcula la renta usando la fórmula
        double renta = saldo / ((1 + ((interes / 100) / periodo)) * ((Math.pow((1 + ((interes / 100) / periodo)), rentas) - 1) / ((interes / 100) / periodo)));

        int rentaNo = 1;

        // Itera para llenar la tabla
        while (saldo > 0) {
            double intereses = saldo * (interes / 100) / periodo; // Cálculo de intereses
            double amortizacion = Math.min(renta - intereses, saldo);             // Cálculo de amortización
            saldo = saldo - amortizacion;                        // Nuevo saldo restante

            // Agrega una nueva fila a la tabla
            TableRow row = new TableRow(this);
            addCellToRow(row, String.valueOf(rentaNo), false);
            addCellToRow(row, String.format("%.2f", renta), false);
            addCellToRow(row, String.format("%.2f", intereses), false);
            addCellToRow(row, String.format("%.2f", amortizacion), false);
            addCellToRow(row, String.format("%.2f", Math.max(saldo, 0)), false);
            TA.addView(row);

            rentaNo++;
        }
    }

    // Método auxiliar para agregar celdas a una fila
    private void addCellToRow(TableRow row, String text, boolean isHeader) {
        TextView cell = new TextView(this);
        cell.setText(text);
        cell.setPadding(8, 8, 8, 8);
        cell.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        cell.setBackgroundResource(isHeader ? android.R.color.darker_gray : android.R.color.transparent);
        row.addView(cell);
    }
}