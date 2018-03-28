package com.example.dar.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * FragmentActivity extends Fragment which then gets and return the view of the fragment_player_prompt.
 * Created by Dar on 3/25/2018.
 */

public class FragmentActivity extends Fragment {

    public FragmentActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate( R.layout.fragment_player_prompt,
                container, false );

    }
}
