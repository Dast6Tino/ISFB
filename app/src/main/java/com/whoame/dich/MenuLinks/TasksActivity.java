package com.whoame.dich.MenuLinks;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.whoame.dich.AllDopClasses.Categoryes;
import com.whoame.dich.AllDopClasses.MyAdapter;
import com.whoame.dich.R;

import java.util.Arrays;
import java.util.List;

public class TasksActivity extends AppCompatActivity {
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager myLayoutManager;

    //TODO исправить инициализацию с говнокодерской на нормальную
    List<Categoryes> list = Arrays.asList(new Categoryes(R.mipmap.web, "Cryptography"), new Categoryes(R.mipmap.web, "Cryptography"), new Categoryes(R.mipmap.web, "Cryptography"), new Categoryes(R.mipmap.web, "Web"), new Categoryes(R.mipmap.ic_launcher, "Steganography"), new Categoryes(0, "Recon"), new Categoryes(0, "Reverse"));



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //наполнение вьюшек в списке
        myRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view_tasks);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        myRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, myRecyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        //Intent intent = new Intent(MainActivity.this, TasksActivity.class);
                        //startActivity(intent);
                    }

                }
                )
        );

        //формирует список вьюшек:
        myAdapter = new MyAdapter(list, this);
        myRecyclerView.setAdapter(myAdapter);
    }
    }

}
