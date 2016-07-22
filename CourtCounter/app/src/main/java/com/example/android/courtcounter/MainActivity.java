package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //TEAM A METHODS
    public void teamAFreeThrow(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void teamATwoPoints(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void teamAThreePoints(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void teamAIncrement(View view) {
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void teamADecrement(View view) {
        if (teamAScore > 0) {
            teamAScore = teamAScore - 1;
        } else {
            teamAScore = 0;
        }
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //TEAM A METHODS
    public void teamBFreeThrow(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void teamBTwoPoints(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    public void teamBThreePoints(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    public void teamBIncrement(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    public void teamBDecrement(View view) {
        if (teamBScore > 0) {
            teamBScore = teamBScore - 1;
        } else {
            teamBScore = 0;
        }
        displayForTeamB(teamBScore);
    }

    //Reset button
    public void resetScores(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
        teamBScore = 0;
        displayForTeamB(teamBScore);
    }

}
