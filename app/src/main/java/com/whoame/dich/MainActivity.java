package com.whoame.dich;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import com.whoame.dich.AllDopClasses.Categoryes;
import java.util.ArrayList;
import java.util.List;

//Todo посмотреть не устарело ли AppCompatActivity

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTasksClick(View view) {
        Intent intent = new Intent(MainActivity.this, TasksActivity.class);
        startActivity(intent);
    }

    public void onInfoClick(View view) {
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    public void onAboutClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
