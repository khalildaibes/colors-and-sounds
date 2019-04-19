package com.example.black_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

public class SignActivity extends AppCompatActivity {

        Button add,show;
            ScrollView sc;
        EditText _name,_lastname,_username,_phone,_password,_mail;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign);
            setTitle("  THE GAME                         SIGN UP  ");



        }

    public void add_person_sign(View view) {

        _name = (EditText)findViewById(R.id.ename);
        _lastname = (EditText)findViewById(R.id.lastname);
        _phone = (EditText)findViewById(R.id.ephone);
        _password= (EditText)findViewById(R.id.epassword);
        _username = (EditText)findViewById(R.id.username);
        _mail = (EditText)findViewById(R.id.mail);
        String name, lastname, password, mail, phone, username;
           my_db md1;
           md1 = new my_db(getApplicationContext(), "khaLil", null, 1);
           name = _name.getText().toString();
           lastname = _lastname.getText().toString();
           password = _password.getText().toString();
           phone = _phone.getText().toString();
           mail = _mail.getText().toString();
           username = _username.getText().toString();

            String avi;
           int score = 0;
           avi=md1.check_avilable(username);
           if(avi=="go") {
               md1.add_person(name, phone, mail, lastname, password, username, score);
               Toast.makeText(getApplicationContext(), "you have signed up succssfuly ", Toast.LENGTH_LONG).show();
               _username.setText("");
               _name.setText("");
               _mail.setText("");
               _phone.setText("");
               _password.setText("");
               _lastname.setText("");
           }
           else {
               Toast.makeText(getApplicationContext(), "the user is not avilable ", Toast.LENGTH_LONG).show();
           }
       }

    }




