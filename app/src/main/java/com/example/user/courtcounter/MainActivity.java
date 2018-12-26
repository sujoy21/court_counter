package com.example.user.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * this is called when +2 is pressed.
     */
    public void twopoints(View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * this is called when +3 is pressed
     */
    public void threepoints(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * this is called when free is pressed
     */
    public void onepoints(View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * resets the value
     */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * this is called when +2 is pressed.
     */
    public void twopoint(View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * this is called when +3 is pressed
     */
    public void threepoint(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * this is called when free is pressed
     */
    public void onepoint(View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
