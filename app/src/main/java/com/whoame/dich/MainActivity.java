package com.whoame.dich;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
=======
import android.view.View;
>>>>>>> 7e4f926d1a145b7f2458213534534701b4aef1e0
import android.support.v7.widget.RecyclerView;
import com.whoame.dich.AllDopClasses.Categoryes;
<<<<<<< HEAD
import com.whoame.dich.AllDopClasses.CryptographyActivity;

import java.util.ArrayList;
import java.util.List;

import android.view.View;

=======
import java.util.ArrayList;
import java.util.List;

//Todo посмотреть не устарело ли AppCompatActivity
>>>>>>> 7e4f926d1a145b7f2458213534534701b4aef1e0

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
        /* Работа со списком - генерация сохраненных дат в норм список
        * */
    recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);

=======
>>>>>>> 7e4f926d1a145b7f2458213534534701b4aef1e0
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
<<<<<<< HEAD
=======
        /* Работа со списком - генерация сохраненных дат в норм список
        * */
>>>>>>> 7e4f926d1a145b7f2458213534534701b4aef1e0
}
