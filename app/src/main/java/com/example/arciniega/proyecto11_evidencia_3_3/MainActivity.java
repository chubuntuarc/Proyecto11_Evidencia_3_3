package com.example.arciniega.proyecto11_evidencia_3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaración de las variables
    private Spinner spinner;
    private TextView divisa1;
    private TextView divisa2;
    private TextView resultado;
    private EditText editDivisa1;
    private Button btnConvertir;

    // Variables para el calculo
    private String dato;
    private double val1;
    private double val2;
    private double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
