package com.example.black_000.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class M9Activity extends AppCompatActivity {
        RadioButton rb6;
    String log1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m9);
        setTitle("  THE GAME                         PICTURE");
        rb6=(RadioButton)findViewById(R.id.RED);
        log1=MainActivity.logname.toString();
    }

    public void check_answer5(View view) {
        if(rb6.isChecked()){
            int score1;

            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo",Toast.LENGTH_LONG).show();
            Toast.makeText(this,"you are correct amigoo!!",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M9Activity.this, M10Activity.class);
            startActivity(intent);

        }
        else
        {
            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.Dec_score(log1);
            Toast.makeText(this,"you are wrong  amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M9Activity.this, M10Activity.class);
            startActivity(intent);
        }
    }
}
