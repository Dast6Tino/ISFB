package com.whoame.dich.MenuLinks;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.whoame.dich.AllDopClasses.Categoryes;
import com.whoame.dich.R;

/**
 * Created by medwedizaa on 30.10.16.
 */

//Активити, которое вызывает статью из выбранной категории

public class ContentCategory  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.cont_cat);
    }

}