package com.example.fernandez_yoel_ev1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button contacto= findViewById(R.id.contacto);

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);


//Iniciamos la nueva actividad
                startActivity(intent);



            }
        });
// TODO Auto-generated method stub

  ImageButton foto=findViewById(R.id.foto);
  foto.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent= new Intent(MainActivity.this,Calculadora.class);

                  startActivity(intent);
      }
  });
// TODO Auto-generated method stub

        TextView titulo = findViewById(R.id.datos);
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.anim1);
        titulo.startAnimation(hyperspaceJumpAnimation);
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

            case R.id.calcuadora:
                Intent intent = new Intent(MainActivity.this, Calculadora.class);

                startActivity(intent);

                return true;

            case R.id.contacto:

                Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);

                startActivity(intent2);
                return true;

            default: return super.onOptionsItemSelected(item);

        }

    }
}
