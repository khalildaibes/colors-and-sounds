package com.example.black_000.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;
import android.widget.TextView;

public class M10Activity extends AppCompatActivity {
        MediaPlayer mysound;
        String score,log1;
    TextView _scoretx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m10);
        setTitle("  THE GAME                         PICTURE FINISHED");
        mysound=(MediaPlayer.create(this,R.raw.endsound));
        mysound.start();
        log1=MainActivity.logname.toString();
    }





    public void Go_to_hard(View view) {
        Intent intent = new Intent(M10Activity.this, A1Activity.class);
        startActivity(intent);
        mysound.pause();

    }

    public void Go_to_menu(View view) {
        Intent intent = new Intent(M10Activity.this, MainActivity.class);
        startActivity(intent);
        mysound.pause();

    }

    public void Restart(View view) {
        Intent intent1 = new Intent(M10Activity.this, M3Activity.class);
        startActivity(intent1);
        mysound.pause();
    }
}
