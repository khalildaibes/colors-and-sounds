package com.example.black_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.ListView;

import org.w3c.dom.Text;

public class scoreActivity extends AppCompatActivity {
    ListView m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_score);

        my_db md1;
        md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
        String[] values = new String[]{""+md1.get_all_persons()};
            ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,R.layout.layout , values);
        m1 = (ListView) findViewById(R.id.label1);
        m1.setAdapter(adapter);

        }



}
