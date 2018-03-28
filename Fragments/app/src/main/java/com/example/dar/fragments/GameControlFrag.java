package com.example.dar.fragments;

import android.app.Fragment;
import android.util.Log;

/**
 * Created by seanr on 3/27/2018.
 */

public class GameControlFrag extends Fragment
{
    int number;
    public GameControlFrag(){}

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        Log.i("gameControlGetNumber", " " + number);
        return number;
    }
}
