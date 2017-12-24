package com.example.tee.madassignment2;

import android.app.usage.UsageEvents;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.EventLog;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;

public class SampleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        EventBus.getDefault().register(this);


        }

    @Subscribe
    public void onEvent(EventPojo event){

        startActivity(new Intent(this,Main2Activity.class));
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

        EventBus.getDefault().unregister(this);
    }


    @Override
    protected void onResume() {

        super.onResume();

    }
    }


