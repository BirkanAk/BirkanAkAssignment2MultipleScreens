package com.example.birkanakassignment2multiplescreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    }

    public void GambleClick(View view) {
    }
}