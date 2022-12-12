package com.example.fernandez_yoel_ev1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    Button button;
    EditText correo, asunto, mensaje;
    SeekBar valoracion;
    TextView valor;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        correo = findViewById(R.id.correo);
        asunto = findViewById(R.id.asunto);
        mensaje = findViewById(R.id.contenido);
        button = findViewById(R.id.enviar);
        valoracion = findViewById(R.id.valoracion);
        valor=findViewById(R.id.valor);
        valoracion.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                valor.setText(i+"/10");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enviarcorreo = correo.getText().toString();
                String enviarasunto = asunto.getText().toString();
                String enviarmensaje = mensaje.getText().toString();
                String enviarvaloracion=valor.getText().toString();
                String contenido= "Valoracion:" + enviarvaloracion + "\n" + enviarmensaje;

                // Defino mi Intent y hago uso del objeto ACTION_SEND
                Intent intent = new Intent(Intent.ACTION_SEND);

                // Defino los Strings Email, Asunto y Mensaje con la función putExtra
                intent.putExtra(Intent.EXTRA_EMAIL,
                        new String[] { enviarcorreo });
                intent.putExtra(Intent.EXTRA_SUBJECT, enviarasunto);
                intent.putExtra(Intent.EXTRA_TEXT, contenido);

                // Establezco el tipo de Intent
                intent.setType("message/rfc822");

                // Lanzo el selector de cliente de Correo
                startActivity(
                        Intent
                                .createChooser(intent,
                                        "Elije un cliente de Correo:"));
            }


        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menus,menu);
        return false;
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.inicio:
                Intent intent = new Intent(MainActivity3        1º  11.this, MainActivity.class);

                startActivity(intent);

                return true;

            case R.id.conta:

                Intent intent2 = new Intent(MainActivity3.this, MainActivity3.class);

                startActivity(intent2);
                return true;


            case R.id.email:

                String url = "https://www.gmail.com";
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));


                startActivity(intent3);
                return true;

            case R.id.cal_2:
                String url2 = "https://web2.0calc.es/";
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(url2));




                startActivity(intent4);
                return true;

            case R.id.calculator:
                Intent intent5 = new Intent(MainActivity3.this,Calculadora.class);



                startActivity(intent5);
                return true;
            default: return super.onOptionsItemSelected(item);
        }


    }

    }
