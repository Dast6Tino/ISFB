package com.whoame.dich;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v7.widget.LinearLayoutManager;
=======
>>>>>>> 6f1e3fc598ad648ffbb737a5a4807a4707f9f9f4
import android.view.View;
import android.support.v7.widget.RecyclerView;
import com.whoame.dich.AllDopClasses.Categoryes;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 6f1e3fc598ad648ffbb737a5a4807a4707f9f9f4

//Todo посмотреть не устарело ли AppCompatActivity

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

<<<<<<< HEAD
    public void onAboutClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onInfoClick(View view) {
=======
>>>>>>> 6f1e3fc598ad648ffbb737a5a4807a4707f9f9f4
        /* Работа со списком - генерация сохраненных дат в норм список
        * */
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
