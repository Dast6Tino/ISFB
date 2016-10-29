package com.whoame.dich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.whoame.dich.AllDopClasses.Categoryes;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.CalendarContract;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Key;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    List<Categoryes> list = new ArrayList<Categoryes>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        /* Работа со списком - генерация сохраненных дат в норм список
        * */
    recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
}
