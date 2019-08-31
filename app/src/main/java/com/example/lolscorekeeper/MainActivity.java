package com.example.lolscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int kA = 0, aA = 0, dA = 0;
    int kB = 0, aB = 0, dB = 0;

    public void s1(View view) {
        scoreTeamA = scoreTeamA + 2;
        kA = kA + 1;
        displayForTeamA(scoreTeamA);
        displayForTeamkA(kA);
    }

    public void s2(View view) {
        scoreTeamA = scoreTeamA + 1;
        aA = aA + 1;
        displayForTeamA(scoreTeamA);
        displayForTeamaA(aA);
    }

    public void s3(View view) {
        scoreTeamA = scoreTeamA - 1;
        dA = dA + 1;
        displayForTeamA(scoreTeamA);
        displayForTeamdA(dA);
    }

    public void s4(View view) {
        scoreTeamB = scoreTeamB + 2;
        kB = kB + 1;
        displayForTeamB(scoreTeamB);
        displayForTeamkB(kB);
    }

    public void s5(View view) {
        scoreTeamB = scoreTeamB + 1;
        aB = aB + 1;
        displayForTeamB(scoreTeamB);
        displayForTeamaB(aB);
    }

    public void s6(View view) {
        scoreTeamB = scoreTeamB - 1;
        dB = dB + 1;
        displayForTeamB(scoreTeamB);
        displayForTeamdB(dB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_11_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamkA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_k);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamaA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamdA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_d);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_21_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamkB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_k);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamaB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamdB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_d);
        scoreView.setText(String.valueOf(score));
    }
}
