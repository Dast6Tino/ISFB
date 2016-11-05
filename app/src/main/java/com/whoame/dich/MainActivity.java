package com.whoame.dich;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.whoame.dich.MenuLinks.AboutActivity;
import com.whoame.dich.MenuLinks.InfoActivity;
import com.whoame.dich.MenuLinks.TasksActivity;

//Todo посмотреть не устарело ли AppCompatActivity

public class MainActivity extends AppCompatActivity {

    Dialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(MainActivity.this);

        dialog.setTitle(getResources().getString(R.string.title_login));
        dialog.setContentView(R.layout.dialog_view);
    }

    public void onLoginClick(View v)
    {
        // Выводим диалоговое окно на экран
        dialog.show();
        
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
