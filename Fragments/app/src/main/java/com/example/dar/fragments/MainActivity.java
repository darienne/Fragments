package com.example.dar.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity{

    private GuessCheck guessCheck;
    private RandomNumberFrag randomNumber;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );

        if(guessCheck == null)
        {
            RandomNumberFrag number = new RandomNumberFrag();
            guessCheck = new GuessCheck(number.getNumber());
        }

        setContentView( R.layout.activity_main );

    }}