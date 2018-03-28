package com.example.dar.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * InputFrag extends Fragment which then gets and return the view of the fragment_input.
 * Created by Group 3-1 on 3/27/2018.
 */

public class InputFrag extends Fragment
{
    public InputFrag() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate( R.layout.frapment_input,
                container, false );
    }
}
