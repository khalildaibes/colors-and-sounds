package com.example.black_000.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;


public class Deletea_Activity extends AppCompatActivity  {

        EditText ed1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleten);
        setTitle("  THE GAME                         PROFILE DELETE");
    }

    public void delete(View view) {
        ed1=(EditText)findViewById(R.id.usernamed);
       String usernamed1;
        usernamed1=ed1.getText().toString();
        my_db md1;
        md1 = new my_db(getApplicationContext(),"khaLil",null ,1);
        md1.edit_persons(usernamed1);
        Toast.makeText(this,"you account have been deleted amigooo !!!",Toast.LENGTH_LONG).show();
    }
}

