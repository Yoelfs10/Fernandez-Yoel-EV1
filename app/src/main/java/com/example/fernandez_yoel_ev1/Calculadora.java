package com.example.fernandez_yoel_ev1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho,
            btnNueve, btnPunto, btnIgual, btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar;
    TextView etProceso, etconcatenar;
    double numero1, numero2, resultado;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        btnLimpiar = (Button)findViewById(R.id.borrar);
        btnCero = (Button)findViewById(R.id.cero);
        btnUno = (Button)findViewById(R.id.uno);
        btnDos = (Button)findViewById(R.id.dos);
        btnTres = (Button)findViewById(R.id.tres);
        btnCuatro = (Button)findViewById(R.id.cuatro);
        btnCinco = (Button)findViewById(R.id.cinco);
        btnSeis = (Button)findViewById(R.id.seis);
        btnSiete = (Button)findViewById(R.id.siete);
        btnOcho = (Button)findViewById(R.id.ocho);
        btnNueve = (Button)findViewById(R.id.nueve);
        btnPunto = (Button)findViewById(R.id.coma);
        btnIgual = (Button)findViewById(R.id.igual);
        btnSuma = (Button)findViewById(R.id.suma);
        btnResta = (Button)findViewById(R.id.resta);
        btnMulti = (Button)findViewById(R.id.multiplicacion);
        btnDiv = (Button)findViewById(R.id.division);
        etProceso = (TextView)findViewById(R.id.resultado);

        btnCero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "1");

            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);

                if(etProceso.getText().equals("")){
                    etProceso.setText("0" + ".");
                }

                etProceso.setText(etconcatenar.getText().toString() + ".");
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.resultado);
                if(!etProceso.getText().equals("")) {
                    numero2 = Double.parseDouble(etconcatenar.getText().toString());
                    if (operador.equals("+")) {
                        etProceso.setText("");
                        resultado = numero1 + numero2;
                    }
                    if (operador.equals("-")) {
                        etProceso.setText("");
                        resultado = numero1 - numero2;
                    }
                    if (operador.equals("*")) {
                        etProceso.setText("");
                        resultado = numero1 * numero2;
                    }
                    if (operador.equals("/")) {
                        etProceso.setText("");
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            etProceso.setText("Infinito");
                        }
                    }
                    etProceso.setText(String.valueOf(resultado));
                    numero1=resultado;
                }
                else if(etProceso.getText().equals(numero1+ ".")){
                    etProceso.setText("Pulsa borrar debido a que esta opcion no es valida");
                }
                else{
                    etProceso.setText("0");
                }
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (TextView) findViewById(R.id.resultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (TextView) findViewById(R.id.resultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (TextView) findViewById(R.id.resultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (TextView) findViewById(R.id.resultado);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menus,menu);
        return false;
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.inicio:
                Intent intent = new Intent(Calculadora.this, MainActivity.class);

                startActivity(intent);

                return true;

            case R.id.contacto:

                Intent intent2 = new Intent(Calculadora.this, MainActivity3.class);

                startActivity(intent2);
                return true;

            default: return super.onOptionsItemSelected(item);

        }

    }
}