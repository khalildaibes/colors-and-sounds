package com.example.black_000.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Deleten extends AppCompatActivity {
    EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleten);
    }

    public void delete(View view) {
        ed1=(EditText)findViewById(R.id.usernamed);
        String usernamed1;
        usernamed1=ed1.getText().toString();
        my_db md1;
        md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
        md1.edit_persons(usernamed1);
        Toast.makeText(this, "you account have been deleted amigooo !!!", Toast.LENGTH_LONG).show();
    }

}
