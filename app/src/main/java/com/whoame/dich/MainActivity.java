package com.whoame.dich;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
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

        final Button button_login = (Button) findViewById(R.id.button_login);
        final Button button_tasks = (Button) findViewById(R.id.button_tasks);
        final Button button_info = (Button) findViewById(R.id.button_info);
        final Button button_about = (Button) findViewById(R.id.button_about);

        OnClickListener button_ = new OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button_login:
                        dialog.show();
                        break;
                    case R.id.button_tasks: {
                        Intent intent = new Intent(MainActivity.this, TasksActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button_info: {
                        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button_about: {
                        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        };

        button_login.setOnClickListener(button_);
        button_tasks.setOnClickListener(button_);
        button_info.setOnClickListener(button_);
        button_about.setOnClickListener(button_);
    }

    public void onLoginInClick(View v) {

    }

    public void onRegistrationClick(View v) {

    }
}
