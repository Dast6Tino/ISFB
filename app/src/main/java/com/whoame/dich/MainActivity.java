package com.whoame.dich;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.whoame.dich.MenuLinks.DialogFragmentAbout;
import com.whoame.dich.MenuLinks.InfoActivity;

//Todo посмотреть не устарело ли AppCompatActivity

public class MainActivity extends Activity {

    DialogFragment dig;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_info = (Button) findViewById(R.id.button_info);
        final Button button_about = (Button) findViewById(R.id.button_about);

        OnClickListener button_ = new OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button_info: {
                        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.button_about: {
                        dig = new DialogFragmentAbout();
                        dig.show(getFragmentManager(), "dig");
                        break;
                    }
                }
            }
        };

        button_info.setOnClickListener(button_);
        button_about.setOnClickListener(button_);
    }
}
