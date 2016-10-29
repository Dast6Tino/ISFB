package com.whoame.dich.MenuLinks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.whoame.dich.AllDopClasses.Categoryes;
import com.whoame.dich.AllDopClasses.MyAdapter;
import com.whoame.dich.R;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {


    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager myLayoutManager;

    List<Categoryes> list = new ArrayList<Categoryes>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //наполнение вьюшек в списке
        myRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        //формирует список вьюшек:
        myAdapter = new MyAdapter(list, this);
        myRecyclerView.setAdapter(myAdapter);
    }
}
