package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int totalPointsTeamA = 0;
    private int totalPointsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize the total points view for Team A and B to zero
        updateTotalPointsViewTeamA();
        updateTotalPointsViewTeamB();
    }

    /*
     * Increases the total number of points and updates the Team Ascore in the view
     */
    public void addPointTeamA(View view) {

        switch (view.getId()) {

            case R.id.team_a_three_points_button:
                totalPointsTeamA += 3;
                break;
            case R.id.team_a_two_points_button:
                totalPointsTeamA += 2;
                break;
            case R.id.team_a_free_throw_button:
                totalPointsTeamA++;
                break;
            default:
                break;
        }

        updateTotalPointsViewTeamA();
    }

    /*
     * Updates the text view with the total number of points Team A scored
     */
    public void updateTotalPointsViewTeamA() {
        TextView totalPointView = findViewById(R.id.team_a_total_points_text_view);
        totalPointView.setText(String.valueOf(totalPointsTeamA));
    }

    /*
     * Increases the total number of points and updates the Team Ascore in the view
     */
    public void addPointTeamB(View view) {

        switch (view.getId()) {

            case R.id.team_b_three_points_button:
                totalPointsTeamB += 3;
                break;
            case R.id.team_b_two_points_button:
                totalPointsTeamB += 2;
                break;
            case R.id.team_b_free_throw_button:
                totalPointsTeamB++;
                break;
            default:
                break;
        }

        updateTotalPointsViewTeamB();
    }

    /*
     * Updates the text view with the total number of points Team B scored
     */
    public void updateTotalPointsViewTeamB() {
        TextView totalPointView = findViewById(R.id.team_b_total_points_text_view);
        totalPointView.setText(String.valueOf(totalPointsTeamB));
    }

    /*
     * Resets the total number of points scored for Team A and Team B and updates their views
     */
    public void resetTotalPoints(View view) {

        totalPointsTeamA = totalPointsTeamB = 0;

        updateTotalPointsViewTeamA();
        updateTotalPointsViewTeamB();
    }
}
