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
    private InputFrag input;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate( savedInstanceState );
        number = new RandomNumberFrag();


        if(guessCheck == null)
        {
            guessCheck = new GuessCheck(number.getNumber());
            Log.i("randomNumber ", " " + guessCheck.getRandomNumber());
        }
        setContentView( R.layout.activity_main );



    }

    public void play(View view)
    {
        game = new GameControlFrag();
        EditText edit = findViewById(R.id.guessEditText);
        TextView tv = findViewById(R.id.player_promptTV);


        String number = edit.getText().toString();
        int guessNumber = Integer.parseInt(number);
        game.setNumber(guessNumber);
        tv.setText(guessCheck.checkGuess(game.getNumber()));
        Log.i("sadf", "" + guessCheck.getRandomNumber());

    }
}