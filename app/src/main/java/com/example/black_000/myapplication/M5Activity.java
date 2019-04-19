package com.example.black_000.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class M5Activity extends AppCompatActivity {
    String log1;
    RadioButton rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m5);
        setTitle("  THE GAME                         PICTURE");
        rb3=(RadioButton)findViewById(R.id.GREEN);
        log1=MainActivity.logname.toString();
    }

    public void Check_asnwer1(View view) {
        if(rb3.isChecked()){


            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.add_score(log1);
            Toast.makeText(this, "you are correct amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M5Activity.this, M6Activity.class);
            startActivity(intent);

        }
        else
        {
            my_db md1;
            md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
            md1.Dec_score(log1);
            Toast.makeText(this,"you are wrong  amigo",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(M5Activity.this, M6Activity.class);
            startActivity(intent);
        }
    }
}
