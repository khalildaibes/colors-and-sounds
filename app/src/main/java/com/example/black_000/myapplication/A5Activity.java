package com.example.black_000.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class A5Activity extends AppCompatActivity {
        MediaPlayer mysound;
    RadioButton rb8;
    String log1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a5);
        setTitle("  THE GAME                         SOUND");
        mysound=MediaPlayer.create(this,R.raw.cat);
        rb8=(RadioButton)findViewById(R.id.cat);
        log1=MainActivity.logname.toString();


    }

    public void play1(View view) {
        mysound.start();
    }

    public void check(View view) {
        if(rb8.isChecked()){
            int score1;

            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo",Toast.LENGTH_LONG).show();
            Toast.makeText(this,"you are correct amigoo!!!",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(A5Activity.this,A6Activity.class);
            startActivity(intent);
        }   else
        {
            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.Dec_score(log1);
            Toast.makeText(this,"you are wrong  amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(A5Activity.this, A6Activity.class);
            startActivity(intent);
        }
    }
}
