package com.example.black_000.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class M7Activity extends AppCompatActivity {
 RadioButton rb5;
    String log1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m7);
        setTitle("  THE GAME                         PICTURE");
        log1=MainActivity.logname.toString();
        rb5=(RadioButton)findViewById(R.id.indigo);
    }

    public void Check_asnwer4(View view) {
        if(rb5.isChecked()){
            int score1;

            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo",Toast.LENGTH_LONG).show();
            Toast.makeText(this,"you are correct amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M7Activity.this, M8Activity.class);
            startActivity(intent);

        }
        else
        {
            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.Dec_score(log1);
            Toast.makeText(this,"you are wrong  amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M7Activity.this, M8Activity.class);
            startActivity(intent);
        }
    }
}
