package com.example.black_000.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class A10Activity extends AppCompatActivity {
 MediaPlayer mysound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a10);
        setTitle("  THE GAME                         SOUND FINISHED");
        mysound=(MediaPlayer.create(this,R.raw.endsound));
        mysound.start();
    }

    public void Go_to_hard(View view) {
        Toast.makeText(this, "you are going to hell", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(A10Activity.this,Score_Board_Activity.class);
        startActivity(intent);
    }

    public void Go_to_menu(View view) {
        Toast.makeText(this, "you are going to menu", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(A10Activity.this,MainActivity.class);
        startActivity(intent);
    }

    public void Restart(View view) {
        Toast.makeText(this, "you are going to restart", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(A10Activity.this,A1Activity.class);
        startActivity(intent);

    }
}
