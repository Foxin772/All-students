package com.example.denci.students.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.example.denci.students.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setTitle("Задолбался");
        setContentView(R.layout.activity_main);
    }


    public void onStart(View view)
    {
        Intent intent = new Intent("start");
        startActivity(intent);
    }


    public void onExit(View view)
    {
        finish();
    }
}
