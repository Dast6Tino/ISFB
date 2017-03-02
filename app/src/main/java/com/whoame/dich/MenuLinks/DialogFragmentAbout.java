package com.whoame.dich.MenuLinks;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whoame.dich.R;

public class DialogFragmentAbout extends DialogFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.dialog_fragment_about, null, false);
        return  v;
    }

}
