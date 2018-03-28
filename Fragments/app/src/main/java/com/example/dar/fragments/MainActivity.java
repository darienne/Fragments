package com.example.dar.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity
{

    private GuessCheck guessCheck;
    private RandomNumberFrag number;
    private GameControlFrag game;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );

        if(guessCheck == null)
        {
            number = new RandomNumberFrag();
            guessCheck = new GuessCheck(number.getNumber());
        }

        setContentView( R.layout.activity_main );

        FragmentManager fragmentManager = getFragmentManager();
        if(fragmentManager.findFragmentById(R.id.rng)== null)
        {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            RandomNumberFrag rngFrag = new RandomNumberFrag();
            transaction.add(R.id.rng, rngFrag);
            transaction.commit();
        }
    }

    public void play(View view)
    {
        FragmentManager fragmentManager = getFragmentManager();
        if(fragmentManager.findFragmentById(R.id.rng)== null)
        {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            RandomNumberFrag rngFrag = new RandomNumberFrag();
            transaction.add(R.id.rng, rngFrag);
            transaction.commit();
        }

        

    }
}