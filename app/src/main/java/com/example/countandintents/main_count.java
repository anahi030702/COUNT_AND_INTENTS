package com.example.countandintents;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class main_count extends AppCompatActivity {
        private TextView textViewCounter;
        private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_count);

        textViewCounter = findViewById(R.id.textViewCounter);

        // Iniciar el contador de 5 segundos
        countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Actualizar el texto del contador en cada tick
                textViewCounter.setText(String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                // Cuando el contador termina, inicia la siguiente actividad
                startActivity(new Intent(main_count.this, MainActivity.class));
                finish(); // Cierra esta actividad para que no puedas volver atrás
            }
        }.start();
    }
}