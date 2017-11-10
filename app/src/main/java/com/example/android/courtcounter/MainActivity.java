package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Declare global variables
     */
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score by 1
     */
    public void increaseBy1TeamA(View view) {
        teamAScore += 1;
        displayScoreTeamA(teamAScore);
    }

    /**
     * Increase the score by 2
     */
    public void increaseBy2TeamA(View view) {
        teamAScore += 2;
        displayScoreTeamA(teamAScore);
    }

    /**
     * Increase the score by 3
     */
    public void increaseBy3TeamA(View view) {
        teamAScore += 3;
        displayScoreTeamA(teamAScore);
    }

    /**
     * Displays the score for Team A
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score by 1
     */
    public void increaseBy1TeamB(View view) {
        teamBScore += 1;
        displayScoreTeamB(teamBScore);
    }

    /**
     * Increase the score by 2
     */
    public void increaseBy2TeamB(View view) {
        teamBScore += 2;
        displayScoreTeamB(teamBScore);
    }

    /**
     * Increase the score by 3
     */
    public void increaseBy3TeamB(View view) {
        teamBScore += 3;
        displayScoreTeamB(teamBScore);
    }

    /**
     * Displays the score for Team B
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams
     */
    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;
        TextView teamA = (TextView) findViewById(R.id.teamAScore);
        TextView teamB = (TextView) findViewById(R.id.teamBScore);
        teamA.setText(String.valueOf(teamAScore));
        teamB.setText(String.valueOf(teamBScore));
    }
}
