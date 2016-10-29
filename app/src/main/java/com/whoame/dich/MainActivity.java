package com.whoame.dich;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
=======
<<<<<<< HEAD
import android.support.v7.widget.RecyclerView;

import com.whoame.dich.AllDopClasses.Categoryes;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.CalendarContract;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Key;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
=======
import android.view.View;
>>>>>>> a5a6ac2add19f6f25bec17a11ad010f979c3e083
>>>>>>> e55e479a384bf19a23c8a73aef62b4d2baf84fa7

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
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
=======
<<<<<<< HEAD

        /* Работа со списком - генерация сохраненных дат в норм список
        * */
    recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
=======
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, CryptographyActivity.class);
        startActivity(intent);
    }
>>>>>>> a5a6ac2add19f6f25bec17a11ad010f979c3e083
>>>>>>> e55e479a384bf19a23c8a73aef62b4d2baf84fa7
}
