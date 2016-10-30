package com.whoame.dich.MenuLinks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.whoame.dich.MenuLinks.Tasks.Crypto.Crypto1TasksActivity;
import com.whoame.dich.R;

public class TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void onTask1Click(View view) {
        Intent intent = new Intent(TasksActivity.this, Crypto1TasksActivity.class);
        startActivity(intent);
    }


}
