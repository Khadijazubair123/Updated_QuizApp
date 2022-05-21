package com.example.quiz_application;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity5 extends AppCompatActivity {

    TextView tvTimer;
    TextView tvResult;
    ImageView ivShowImage;
    HashMap<String,Integer> map=new HashMap<>();
    ArrayList<String> techList=new ArrayList<>();
    int index;
    Button btn1,btn2,btn3,btn4;
    TextView tvPoints;
    int points;
    CountDownTimer countDownTimer;
    long millisUntilFinished;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tvTimer=findViewById(R.id.tvTimer);
        tvResult=findViewById(R.id.tvResult);
        ivShowImage=findViewById(R.id.ivShowImage);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
    }

    public void nextQuestion(View view) {
    }

    public void answerSelected(View view) {
    }
}