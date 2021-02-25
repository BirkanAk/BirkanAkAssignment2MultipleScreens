package com.example.birkanakassignment2multiplescreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity {
    Button GambleButton;
    Button ChangeViewButton2;
    TextView scoretext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        ChangeViewButton2 = findViewById(R.id.ChangeViewButton2);
        GambleButton = findViewById(R.id.GambleButton);
        scoretext = findViewById(R.id.scoretext);
        scoretext.setText("Score: "+Score.point);
    }

    public void onChangeViewClick(View view) {
        Intent change_view = new Intent(this,MainActivity.class);
        startActivity(change_view);
    }

    public void GambleClick(View view) {
        Random rn = new Random();
        int randomNum =  rn.nextInt(21) - 10;
        //System.out.println(randomNum);
        Score.getInstance();
        Score.point+=randomNum;
        scoretext.setText("Score: "+Score.point);

    }
}