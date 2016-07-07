package com.example.arciniega.proyecto11_evidencia_3_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Calculo c = new Calculo();
    // Declaramos un arreglo con los valores que se mostaran en el Spinner
    private String[] spinnerDatos = new String[]{
            "MXN - Dólar",
            "MXN - Euro",
            "Dólar - Euro",
            "Dólar - MXN",
            "Euro - Dólar",
            "Euro - MXN"
    };

    // Declaración de las variables
    private Spinner spinner;
    private EditText divisa1;
    private TextView resultado;
    private TextView valor;
    private Button btnConvertir;

    // Variables para el calculo
    private String dato;
    private String res;
    private String valorDivisa;

    // Se crea un adaptador de datos para el control spinner
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // El adaptador recibe tres parametros: this - Contexto de la aplicacion, R.layout... - Indicando que soportada un dropdown - spinnerDatos - El arreglo de datos
        adaptador  = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,spinnerDatos);

        // Se hace la relación entre las variable Java y las XML
        spinner = (Spinner)findViewById(R.id.spinner);
        divisa1 = (EditText)findViewById(R.id.editDivisa1);
        resultado = (TextView)findViewById(R.id.txtResultado);
        btnConvertir = (Button)findViewById(R.id.btnConvertir);
        valor = (TextView)findViewById(R.id.txtValor);

        // Enlazar el adaptador con el spinner
        spinner.setAdapter(adaptador);

        // Establecer un listener para el evento 'Selección de item'
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            // ¿Que ocurre al seleccionar un item determinado?
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
                // Se asigna el valor seleccionado del spinner
                dato = spinnerDatos[i].toString();
                c.setSeleccion(dato);
            }
            // ¿Qué ocurre al no seleccionar nada?
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                resultado.setText("0");
                valor.setText("");
            }
        });

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.setVal1(Double.parseDouble(divisa1.getText().toString()));
                c.mostrarConversion();
                res = c.getRes();
                resultado.setText(res);
                valorDivisa = c.getValorDivisa();
                valor.setText(valorDivisa);
            }
        });
    }
}
