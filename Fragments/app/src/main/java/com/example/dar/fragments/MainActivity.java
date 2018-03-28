package com.example.dar.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{

    private GuessCheck guessCheck;
    private RandomNumberFrag number;
    private GameControlFrag game;

    /**
     * number is going to get new RandomNumberFrag.
     * if guesscheck == null then guesscheck is going to get new guesscheck with number.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );
        number = new RandomNumberFrag();

        if(guessCheck == null)
        {
            guessCheck = new GuessCheck(number.getNumber());
            Log.i("OnCreate randomNumber ", " " + guessCheck.getRandomNumber());
        }
        setContentView( R.layout.activity_main );
    }

    /**
     * Play is going to have a new GameControlFrag that is under game. EditText guessEditText, TextView player_promptTV.
     * Create a string for number to get text. 
     * @param view
     */
    public void play(View view)
    {
        game = new GameControlFrag();
        EditText edit = findViewById(R.id.guessEditText);
        TextView tv = findViewById(R.id.player_promptTV);

        String number = edit.getText().toString();
        int guessNumber = Integer.parseInt(number);
        game.setNumber(guessNumber);
        tv.setText(guessCheck.checkGuess(game.getNumber()));
        Log.i("play RandomNumber", "" + guessCheck.getRandomNumber());
    }
}