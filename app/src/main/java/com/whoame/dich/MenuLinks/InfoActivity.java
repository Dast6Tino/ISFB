package com.whoame.dich.MenuLinks;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.whoame.dich.AllDopClasses.Categoryes;
import com.whoame.dich.AllDopClasses.MyAdapter;
import com.whoame.dich.MainActivity;
import com.whoame.dich.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager myLayoutManager;
    Context context;

    //TODO исправить инициализацию с говнокодерской на нормальную
    List<Categoryes> list = Arrays.asList(new Categoryes(R.mipmap.format_align_right, "Cryptography"), new Categoryes(R.mipmap.web, "Web"), new Categoryes(R.mipmap.format_wrap_tight, "Steganography"), new Categoryes(R.mipmap.magnify, "Recon"), new Categoryes(R.mipmap.replay, "Reverse"));



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
