package com.example.black_000.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class M3Activity extends AppCompatActivity {
        RadioButton rb2;
    String log1;
        EditText _name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log1=MainActivity.logname.toString();
        setContentView(R.layout.activity_m3);
        setTitle("  THE GAME                         PICTURE");
        rb2 = (RadioButton) findViewById(R.id.ORANGE);
    }
    public void on_click(View view) {
        if (rb2.isChecked()) {
            int score1;

            my_db md1;
            md1 = new my_db(getApplicationContext(), "khaLil", null, 1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M3Activity.this, M4Activity.class);
            startActivity(intent);
        } else {
            my_db md1;
            md1 = new my_db(getApplicationContext(), "khaLil", null, 1);
            md1.Dec_score(log1);
            Toast.makeText(this, "you are wrong  amigo", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M3Activity.this, M4Activity.class);
            startActivity(intent);
        }

    }
        }


