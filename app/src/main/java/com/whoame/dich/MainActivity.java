package com.whoame.dich;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.whoame.dich.AllDopClasses.Categoryes;
import com.whoame.dich.AllDopClasses.CryptographyActivity;

import java.util.ArrayList;
import java.util.List;

import android.view.View;


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

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, CryptographyActivity.class);
        startActivity(intent);
    }
}
