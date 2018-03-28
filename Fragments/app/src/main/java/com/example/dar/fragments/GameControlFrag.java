package com.example.dar.fragments;

import android.app.Fragment;
import android.util.Log;

/**
 * GameControlFrag extends Fragment has an integer number and setNumber will set the number.
 * getNumber will return the number.
 * Created by Group 3-1 on 3/27/2018.
 */

public class GameControlFrag extends Fragment
{
    int number;
    public GameControlFrag(){}

    /**
     * setNumber will take the integer number and set the number.
     * @param number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * getNumber will return the number.
     * @return
     */
    public int getNumber()
    {
        Log.i("gameControlGetNumber", " " + number);
        return number;
    }
}
