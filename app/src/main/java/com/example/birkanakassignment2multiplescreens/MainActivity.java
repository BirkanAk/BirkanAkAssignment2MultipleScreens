package com.example.birkanakassignment2multiplescreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ChangeViewButton;
    Button Point1Button;
    TextView scoretext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChangeViewButton = findViewById(R.id.ChangeViewButton);
        Point1Button = findViewById(R.id.Point1Button);
        scoretext = findViewById(R.id.scoretext);
        scoretext.setText("Score: "+Score.point);

    }

    public void onPoint1Click(View view) {
        Score.getInstance();
        Score.point+=1;
        scoretext.setText("Score: "+Score.point);
    }

    public void onChangeViewClick(View view) {
        Intent act_action = new Intent(this,Activity2.class);
        startActivity(act_action);
    }

}