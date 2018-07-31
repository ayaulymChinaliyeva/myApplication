package com.example.lightapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myapplication.R;


public class VolunteerActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);

        String s = getIntent().getStringExtra(BasicFirst.EXTRA_MESSAGE);
    }
}