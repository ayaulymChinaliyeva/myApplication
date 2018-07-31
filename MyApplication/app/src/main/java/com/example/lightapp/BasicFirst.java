package com.example.lightapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.example.myapplication.R;
import com.stephentuso.welcome.WelcomeHelper;

import butterknife.BindView;
import butterknife.ButterKnife;


public class BasicFirst extends AppCompatActivity {

    @BindView(R.id.volunteerButton)
    Button volunteerButton;
    @BindView(R.id.organizationButton)
    Button organizationButton;

    WelcomeHelper welcomeScreen;

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_first);
        ButterKnife.bind(this);

        welcomeScreen = new WelcomeHelper(this, MyWelcomeActivity.class);
        welcomeScreen.show(savedInstanceState);

    }

    public void openActivityVolunteer(View view){
        Intent intent = new Intent(BasicFirst.this, VolunteerActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

    public void openActivityOrganization(View view){
        Intent intent = new Intent(this, OrganizationActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        welcomeScreen.onSaveInstanceState(outState);
    }
}
