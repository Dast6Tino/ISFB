package com.whoame.dich.MenuLinks;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.whoame.dich.List.ModelItem;
import com.whoame.dich.List.RecyclerAdapter;
import com.whoame.dich.R;

import java.util.ArrayList;

//класс который описывает работу активити "инфа"

public class InfoActivity extends Activity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private RecyclerAdapter adapter;
    private ArrayList<ModelItem> modelItems = new ArrayList<ModelItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //// TODO: тут нужно наполнить список
        for (int i = 0; i < 100; i++) {
            modelItems.add(new ModelItem("", "" + i));
        }
        adapter = new RecyclerAdapter(modelItems, this);
        recyclerView.setAdapter(adapter);
    }
}

