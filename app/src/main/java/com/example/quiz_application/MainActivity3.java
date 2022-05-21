package com.example.quiz_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button dice1;
    private  Button dice2;
    private  Button dice3;
    private  Button dice4;
    private  Button dice5;
    private  Button dice6;
    private  Button dice7;
    private  Button dice8;
    private  Button dice9;
    private  Button dice10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        dice1=findViewById(R.id.B1);
        dice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number1.class);
                startActivity(intent);
            }
        });
        dice2=findViewById(R.id.B2);
        dice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number2.class);
                startActivity(intent);
            }
        });
        dice3=findViewById(R.id.B3);
        dice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number3.class);
                startActivity(intent);
            }
        });
        dice4=findViewById(R.id.B4);
        dice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number4.class);
                startActivity(intent);
            }
        });
        dice5=findViewById(R.id.B5);
        dice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number5.class);
                startActivity(intent);
            }
        });
        dice6=findViewById(R.id.B6);
        dice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number6.class);
                startActivity(intent);
            }
        });
        dice7=findViewById(R.id.B7);
        dice7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number7.class);
                startActivity(intent);
            }
        });
        dice8=findViewById(R.id.B8);
        dice8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number8.class);
                startActivity(intent);
            }
        });
        dice9=findViewById(R.id.B9);
        dice9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number9.class);
                startActivity(intent);
            }
        });
        dice10=findViewById(R.id.B10);
        dice10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this,Number10.class);
                startActivity(intent);
            }
        });
    }
}