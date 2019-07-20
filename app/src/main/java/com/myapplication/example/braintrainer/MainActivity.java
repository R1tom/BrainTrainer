package com.myapplication.example.braintrainer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button goButton = findViewById(R.id.goButton);
    TextView timer=findViewById(R.id.timer);
    TextView marks= findViewById(R.id.marks);
    TextView questions= findViewById(R.id.question);
    GridLayout gridLayout = findViewById(R.id.gridLayout);

    public void start(View view){

        goButton.setVisibility(View.INVISIBLE);
        timer.setVisibility(View.VISIBLE);
        marks.setVisibility(View.VISIBLE);
        questions.setVisibility(View.VISIBLE);
        gridLayout.setVisibility(View.VISIBLE);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
}
