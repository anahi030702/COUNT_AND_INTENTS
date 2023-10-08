package com.example.countandintents;

import static com.example.countandintents.R.id.intentres;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button boto;
    Button boto2;
    Button boto3;
    Button boto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boto = findViewById(R.id.intentuno);
        boto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), second.class);
                startActivity(intent);
            }
        });

        boto2 = findViewById(R.id.intentdos);
        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), third.class);
                startActivity(intent);
            }
        });

        boto3 = findViewById(R.id.intentres);
        boto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), fourth.class);
                startActivity(intent);
            }
        });

        boto4 = findViewById(R.id.intentcuatro);
        boto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), fifth.class);
                startActivity(intent);
            }
        });


    }


    public void facebook(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(intent);
    }

    public void google(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void youtube(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
        startActivity(intent);
    }

    public void whats(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.whatsapp.com"));
        startActivity(intent);
    }
}