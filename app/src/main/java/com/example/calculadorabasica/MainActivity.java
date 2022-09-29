package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText valor1, valor2;
    public Button suma, resta, multi, divi, limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText)findViewById(R.id.inValor1);
        valor2 = (EditText)findViewById(R.id.inValor2);
        suma = (Button)findViewById(R.id.btnSumar);
        resta = (Button)findViewById(R.id.btnRestar);
        multi = (Button)findViewById(R.id.btnMulti);
        divi = (Button)findViewById(R.id.btnDiv);
        limpiar = (Button)findViewById(R.id.btnLimpiar);
    }

    public void Sumar(View view){
        Intent sum = new Intent(this, ResultadosActivity.class);
        try{
            sum.putExtra("valor1", valor1.getText().toString());
            sum.putExtra("valor2", valor2.getText().toString());
            sum.putExtra("operacion", suma.getText().toString());
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());
            String resu = String.valueOf(num1 + num2);
            sum.putExtra("resultado", resu);
            startActivity(sum);
        }
        catch(Exception ex) {
            if (valor1.getText().length()==0){
                sum.putExtra("valor1", 0);
            }
            if (valor2.getText().length()==0){
                sum.putExtra("valor2", 0);
            }
            sum.putExtra("resultado", "Ha dejado campos vacíos");
            sum.putExtra("operacion", suma.getText().toString());
            startActivity(sum);
        }

    }

    public void Restar(View view){
        Intent res = new Intent(this, ResultadosActivity.class);
        try{
            res.putExtra("valor1", valor1.getText().toString());
            res.putExtra("valor2", valor2.getText().toString());
            res.putExtra("operacion", resta.getText().toString());
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());
            String resu = String.valueOf(num1 - num2);
            res.putExtra("resultado", resu);
            startActivity(res);
        }
        catch(Exception ex) {
            if (valor1.getText().length()==0){
                res.putExtra("valor1", 0);
            }
            if (valor2.getText().length()==0){
                res.putExtra("valor2", 0);
            }
            res.putExtra("resultado", "Ha dejado campos vacíos");
            res.putExtra("operacion", resta.getText().toString());
            startActivity(res);
        }
    }

    public void Multiplicar(View view){
        Intent mul = new Intent(this, ResultadosActivity.class);
        try{
            mul.putExtra("valor1", valor1.getText().toString());
            mul.putExtra("valor2", valor2.getText().toString());
            mul.putExtra("operacion", multi.getText().toString());
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());
            String resu = String.valueOf(num1 * num2);
            mul.putExtra("resultado", resu);
            startActivity(mul);
        }
        catch(Exception ex) {
            if (valor1.getText().length()==0){
                mul.putExtra("valor1", 0);
            }
            if (valor2.getText().length()==0){
                mul.putExtra("valor2", 0);
            }
            mul.putExtra("resultado", "Ha dejado campos vacíos");
            mul.putExtra("operacion", multi.getText().toString());
            startActivity(mul);
        }
    }

    public void Dividir(View view){
        Intent div = new Intent(this, ResultadosActivity.class);
        try{
            div.putExtra("valor1", valor1.getText().toString());
            div.putExtra("valor2", valor2.getText().toString());
            div.putExtra("operacion", divi.getText().toString());
            double num1 = Double.parseDouble(valor1.getText().toString());
            double num2 = Double.parseDouble(valor2.getText().toString());
            if(valor2.getText().toString().equals("0")){
                div.putExtra("resultado", "El divisor no puede ser igual a 0.");
            }
            else{
                String resu = String.valueOf(num1 / num2);
                div.putExtra("resultado", resu);
            }

            startActivity(div);
        }
        catch(Exception ex) {
            if (valor1.getText().length()==0){
                div.putExtra("valor1", 0);
                div.putExtra("resultado", "Ha dejado campos vacíos");
            }
            if (valor2.getText().length()==0){
                div.putExtra("valor2", 0);
                div.putExtra("resultado", "Ha dejado campos vacíos");
            }
            div.putExtra("operacion", divi.getText().toString());
            startActivity(div);
        }
    }

    public void Limpiar(View view){
        valor1.setText("");
        valor2.setText("");

    }
}