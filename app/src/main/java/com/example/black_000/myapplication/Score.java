package com.example.black_000.myapplication;

/**
 * Created by black_000 on 1/17/2016.
 */
public class Score {
    public String username;
    public int score;
    public void score (int score ,String user){
        set_score(score);
        set_username(user);
    }
    public void set_score(int x){
        this.score=score+x;

    }
    public void set_username(String user){
        this.username=user;


    }

    public int getScore() {
        return score;
    }

    public String getUsername() {
        return username;
    }
}
