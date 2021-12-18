 package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int point=0;
    int point_2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void point3(View view){
        point=point + 3;
        displayForTeamA(point);
    }
    public void point2(View view){
        point=point + 2;
        displayForTeamA(point);
    }
    public void free_throw(View view){
        point=point + 1;
        displayForTeamA(point);
    }
    public void reset(View view){
        point=0;
        point_2=0;
        displayForTeamB(point_2);
        displayForTeamA(point);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void point3_2(View view){
        point_2=point_2 + 3;
        displayForTeamB(point_2);
    }
    public void point2_2(View view){
        point_2=point_2 + 2;
        displayForTeamB(point_2);
    }
    public void free_throw_2(View view){
        point_2=point_2 + 1;
        displayForTeamB(point_2);
    }


}