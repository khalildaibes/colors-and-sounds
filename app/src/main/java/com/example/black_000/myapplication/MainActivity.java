package com.example.black_000.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    static String logname;
    MediaPlayer mysound;
    static EditText _name,_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("  THE GAME                         MAIN");
        mysound=MediaPlayer.create(this,R.raw.thegame);
        mysound.start();
        MediaController vidControl = new MediaController(this);
        VideoView mVideoView = (VideoView)findViewById(R.id.videoView2);
        String uriPath = "android.resource://com.example.black_000.myapplication/"+R.raw.ved;
        Uri uri = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();

        _name=(EditText)findViewById(R.id.logname);

    }




    public void sign_up(View view) {
        mysound.pause();
        Toast.makeText(this,"you are welcome !!",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, SignActivity.class);
        startActivity(intent);
    }

    public void start_easy(View view) {
        try {_name=(EditText)findViewById(R.id.logname);


            logname=_name.getText().toString();


            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            String res1;
            res1=md1.check_persons(logname);

          if(res1=="go") {
              mysound.pause();
              Toast.makeText(this, "you are in amigoo !!", Toast.LENGTH_LONG).show();
              Intent intent = new Intent(MainActivity.this, M3Activity.class);
              startActivity(intent);
          }
        } catch (Exception e) {
            Log.i("login",e.getMessage());
        }

    }

    public void profile(View view) {
        try {
            mysound.pause();
            Toast.makeText(this,"profile  !!",Toast.LENGTH_LONG).show();
            Intent intent1 = new Intent(MainActivity.this, ProfActivity.class);
            startActivity(intent1);
        } catch (Exception e) {
            Log.i("a1", e.getMessage());
        }
    }

    public void exit(View view) {
      System.exit(1);
    }

    public void sound_g(View view) {
        logname=_name.getText().toString();
        my_db md1;
        md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
        String res1;
        res1=md1.check_persons(logname);

        if(res1=="go") {
            mysound.pause();
            Toast.makeText(this, "sound game :P !!", Toast.LENGTH_LONG).show();
            Intent intent1 = new Intent(MainActivity.this, A1Activity.class);
            startActivity(intent1);
        }
    }

    public void score_b(View view) {
        logname=_name.getText().toString();

        my_db md1;
        md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
        String res1;
        res1=md1.check_persons(logname);

        if(res1=="go") {
            mysound.pause();
        Toast.makeText(this,"the score board ",Toast.LENGTH_LONG).show();
        Intent intent1 = new Intent(MainActivity.this,Score_Board_Activity.class);
        startActivity(intent1);}
    }

    public void restart(View view) {
        MediaController vidControl = new MediaController(this);
        VideoView mVideoView = (VideoView)findViewById(R.id.videoView2);
        String uriPath = "android.resource://com.example.black_000.myapplication/"+R.raw.ved;
        Uri uri = Uri.parse(uriPath);
        mysound=MediaPlayer.create(this,R.raw.thegame);
        mysound.start();
        mVideoView.setVideoURI(uri);
        mVideoView.requestFocus();
        mVideoView.start();
    }
}



