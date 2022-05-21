package com.example.quiz_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button startButton;
    private Button btnStart;
    private Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

        public void startButton(View view){
        Intent intent=new Intent(MainActivity4.this, StartGame.class);
        startActivity(intent);
        }


}