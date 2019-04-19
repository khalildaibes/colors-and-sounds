package com.example.black_000.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class my_db extends SQLiteOpenHelper {
    public my_db(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query;
        query = "create table if not exists persons( name text, phone text, mail text, lastname text, password text, username text,score integer )";
        db.execSQL(query);
    }

    public void add_person(String name,String phone,String mail,String lastnam,String username,String password,int score)
    {
        try {
            SQLiteDatabase db;
            db = getWritableDatabase();
            String query;
            query = "insert into persons (name,phone,mail,lastname,username,password,score) values('"+name+"','"+phone+"','"+mail+"','"+lastnam+"','"+username+"','"+password+"',"+score+")";
            db.execSQL(query);
        } catch (SQLException e) {
            Log.i("a11",e.getMessage());
        }

    }


public String get_all_persons()

{
    SQLiteDatabase db;
    db = getWritableDatabase();
    String query,res="";
    query= "select * from persons";
    Cursor cr;
    cr = db.rawQuery(query,null);
    if(cr.moveToFirst()) {

        do {
            String name1,lastname,phone1,mail1,username1,password1,score;
            int score1;

            name1 = cr.getString(0);
            phone1=cr.getString(1);
            mail1 = cr.getString(2);
            lastname=cr.getString(3);
            password1=cr.getString(4);
            username1 = cr.getString(5);
            score1=cr.getInt(6);


           res +="the name is : "+ name1+ "\n  ******** \nthe phone number: "+ phone1+"\n******** \nthe mail is  : "+mail1+"\n******** \n the username is   : "+username1+" \n******** \n the score is  : "+score1+" \n" +
                   "******** \n";
        }while (cr.moveToNext());

    }
    return res;
}

    public String check_persons(String name)

    {
        SQLiteDatabase db;
        db = getWritableDatabase();
        String query,res="";
        query= "select * from  persons  where username = '"+name+"'" ;
        Cursor cr;
        cr = db.rawQuery(query,null);
        if(cr.moveToFirst()) {

            do {
                    res = "go";
            }while (cr.moveToNext());

        }
        return res;
    }
    public String check_avilable(String name)

    {
        SQLiteDatabase db;
        db = getWritableDatabase();
        String query,res="";
        query= "select * from  persons  where username = '"+name+"'" ;
        Cursor cr;
        cr = db.rawQuery(query,null);
        if(cr.moveToFirst()) {

            do {
                res = "not avilable";
            }while (cr.moveToNext());

        }
        else {
            res="go";
        }
        return res;
    }
    public String getscore(String name)

    {

        SQLiteDatabase db;
        db = getWritableDatabase();
        String query,res="";
        query= "select * from  persons  where username = '"+name+"' order by score desc" ;
        Cursor cr;
        cr = db.rawQuery(query,null);
        if(cr.moveToFirst()) {

            do {
                String name1,lastname,phone1,mail1,username1,password1,score;
                int score1;

                name1 = cr.getString(0);
                phone1=cr.getString(1);
                mail1 = cr.getString(2);
                lastname=cr.getString(3);
                password1=cr.getString(4);
                username1 = cr.getString(5);
                score1=cr.getInt(6);


                res +="the name is : "+ name1+ "\n  ******** \nthe phone number: "+ phone1+"\n******** \nthe mail is  : "+mail1+"\n******** \n the username is   : "+username1+" \n******** \n the score is  : "+score1+" \n" +
                        "******** \n";
            }while (cr.moveToNext());

        }
        return res;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


public String Delete_persons(String username1)

{
   SQLiteDatabase db;
    db = getWritableDatabase();
    String query, res = "your account have been deleted";
    query = "delete  from persons  where username = '"+username1+"'" ;
    Cursor cr;
  cr = db.rawQuery(query, null);
    if(cr.moveToFirst()) {
        do {
            String name1, lastname, phone1, mail1, password1;

            name1 = cr.getString(0);
            lastname = cr.getString(1);
            phone1 = cr.getString(2);
            mail1 = cr.getString(3);
            username1 = cr.getString(4);

            res += "the name is : " + name1 + "\n  ******** \nthe last name : " + lastname + "\n******** \nthe phone number is  : " + phone1 + "\n the mail is  : " + mail1 + " \n******** \n";

        } while (cr.moveToNext());
    }

    return res;
}
    public String edit_persons(String username)

    {
        SQLiteDatabase db;
        db = getWritableDatabase();
        String query, res = "your account have been deleted";
        query = "delete  from persons  where username = '"+username+"'" ;
        Cursor cr;
        cr = db.rawQuery(query, null);

        do {


        } while (cr.moveToNext());


        return res;
    }
    public   void add_score(String username){

        try {
            SQLiteDatabase db;
            db=getWritableDatabase();
            db.execSQL("update persons set score=score+ 10 where username ='"+username+"'") ;
        } catch (SQLException e) {
            Log.i("login",e.getMessage());
        }
        return ;
    }
    public   void Dec_score(String username){

        try {
            SQLiteDatabase db;
            db=getWritableDatabase();
            db.execSQL("update persons set score=score- 5 where username ='"+username+"'") ;
        } catch (SQLException e) {
            Log.i("login",e.getMessage());
        }
        return ;
    }

}