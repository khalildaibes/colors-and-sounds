package com.example.black_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Score_Board_Activity extends AppCompatActivity {
    ListView m1;
    String log1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log1=MainActivity.logname.toString();
        setTitle("  THE GAME                         SCOREBOARD");
        setContentView(R.layout.activity_score__board_);
        my_db md1;
        md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
        String[] values = new String[]{""+md1.getscore(log1)};
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,R.layout.scorebord , values);
        m1 = (ListView) findViewById(R.id.score_board);
        m1.setAdapter(adapter);
    }
}
