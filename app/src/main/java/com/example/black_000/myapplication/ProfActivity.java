package com.example.black_000.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfActivity extends AppCompatActivity {
    EditText _name,_lastname,_username,_phone,_password,_mail;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_prof);

        setTitle("  THE GAME                         PROFILE");

    }

    public void edit_p(View view) {
        Intent intent = new Intent(ProfActivity.this, scoreActivity.class);
        startActivity(intent);
    }


    public void delte2(View view) {
        try {
            Intent intent = new Intent(ProfActivity.this, Deleten.class);
            startActivity(intent);
        } catch (Exception e) {
            Log.i("delete", e.getMessage());
        }
    }
}
