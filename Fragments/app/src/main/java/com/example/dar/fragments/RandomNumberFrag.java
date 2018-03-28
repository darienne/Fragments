package com.example.dar.fragments;

import android.app.Fragment;
import java.util.Random;

/**
 * RandomNumberFrag extends Fragment which getNumber will return the new rand 1-100.
 * Created by Group 3-1 on 3/27/2018.
 */

public class RandomNumberFrag extends Fragment
{
    public RandomNumberFrag(){}

    Random rand = new Random(System.currentTimeMillis());

    /**
     * getNumber will return the number 1-100. 
     * @return
     */
    public int getNumber()
    {
        return rand.nextInt(100) + 1;
    }
}
