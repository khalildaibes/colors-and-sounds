package com.example.black_000.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class M6Activity extends AppCompatActivity {
    String log1;
    RadioButton rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m6);
        setTitle("  THE GAME                         PICTURE");
        rb4=(RadioButton)findViewById(R.id.PINK);
        log1=MainActivity.logname.toString();
    }

    public void Check_asnwer2(View view) {
        if(rb4.isChecked()) {
            int score1;

            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo",Toast.LENGTH_LONG).show();
            Toast.makeText(this,"you are correct amigoo!!1",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M6Activity.this, M7Activity.class);
            startActivity(intent);

        }
        else
        {
            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.Dec_score(log1);
            Toast.makeText(this,"you are wrong  amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M6Activity.this, M7Activity.class);
            startActivity(intent);
        }
    }
}
