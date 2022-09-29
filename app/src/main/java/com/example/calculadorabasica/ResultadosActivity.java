package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class ResultadosActivity extends AppCompatActivity {

    //DECLARACION DE VARIABLES
    public TextView txtCalculo, txtResultado;
    public Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        //UNION DE LAS VARIABLES A TRAVEZ ID
        txtCalculo = (TextView)findViewById(R.id.txtCalculo);
        txtResultado = (TextView)findViewById(R.id.txtResultado);
        volver = (Button)findViewById(R.id.btnVolver);

        //OBTENCION DE VALORES
        String valor1 = getIntent().getStringExtra("valor1");
        String valor2 = getIntent().getStringExtra("valor2");
        String operacion = getIntent().getStringExtra("operacion");
        String resultado = getIntent().getStringExtra("resultado");
        txtCalculo.setText(valor1 + " " + operacion + " " + valor2);
        txtResultado.setText(resultado);
    }

    //BOTON VOLVER
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        this.finish();
        startActivity(volver);
    }
}