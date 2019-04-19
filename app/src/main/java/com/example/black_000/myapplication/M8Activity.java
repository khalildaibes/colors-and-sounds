package com.example.black_000.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class M8Activity extends AppCompatActivity {
    String log1;
    RadioButton rb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m8);
        setTitle("  THE GAME                         PICTURE");
        rb1 = (RadioButton) findViewById(R.id.LBLU);
        log1=MainActivity.logname.toString();
    }

    public void check_1(View view) {
        if (rb1.isChecked()) {
            int score1;

            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo",Toast.LENGTH_LONG).show();
            Toast.makeText(this, "you are correct amigoooo!!!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M8Activity.this, M9Activity.class);
            startActivity(intent);

        }
        else {
            my_db md1;
            md1 = new my_db(getApplicationContext(), "khaLil", null, 1);
            md1.Dec_score(log1);
            Toast.makeText(this, "you are wrong  amigo", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M8Activity.this, M9Activity.class);
            startActivity(intent);
        }

    }


}
