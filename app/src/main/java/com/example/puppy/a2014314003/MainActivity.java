package com.example.puppy.a2014314003;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements UpFragment.TextSendCall{
    UpFragment up;
    DownFragment down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        up = (UpFragment)manager.findFragmentById(R.id.upFragment);
        down = (DownFragment)manager.findFragmentById(R.id.downFragment);
    }

    @Override
    public void printText(String tv1, String tv2, int susik) {
        down.calculateText(tv1,tv2,susik);
    }
}
