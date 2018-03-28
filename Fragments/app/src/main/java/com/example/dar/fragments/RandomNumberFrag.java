package com.example.dar.fragments;

import android.app.Fragment;
import java.util.Random;

/**
 * Created by seanr on 3/27/2018.
 */

public class RandomNumberFrag extends Fragment
{
    public RandomNumberFrag(){}

    Random rand = new Random(0);

    public int getNumber()
    {
        return rand.nextInt(100) + 1;
    }
}
