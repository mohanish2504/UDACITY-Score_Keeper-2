package com.example.kabbadiscorecouter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scA=0,scB=0;
    int plA=7,plB=7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void point_A(View view) {
        TextView score = (TextView) findViewById(R.id.SA);
        TextView players = (TextView) findViewById(R.id.PB);
        if (plB > 0) {
            scA = scA + 1;
            plB = plB - 1;
            score.setText("Score:" + scA);
            players.setText("Players:" + plB);
        }
    }

    public void point_B(View view) {
        TextView score = (TextView) findViewById(R.id.SB);
        TextView players = (TextView) findViewById(R.id.PA);
        if (plA > 0) {
            scB = scB + 1;
            plA = plA - 1;
            score.setText("Score:" + scB);
            players.setText("Players:" + plA);
        }
    }

    public void reset(View view)
    {
        plA=7;
        plB=7;
        scA=0;
        scB=0;

        TextView scoreA = (TextView) findViewById(R.id.SB);
        TextView playersB = (TextView) findViewById(R.id.PA);
        TextView scoreB = (TextView) findViewById(R.id.SA);
        TextView playersA = (TextView) findViewById(R.id.PB);

        scoreB.setText("Score:" + scB);
        playersA.setText("Players:" + plA);
        scoreA.setText("Score:" + scA);
        playersB.setText("Players:" + plB);
    }


}
