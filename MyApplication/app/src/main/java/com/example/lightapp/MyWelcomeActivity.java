package com.example.lightapp;

import com.example.myapplication.R;
import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;


public class MyWelcomeActivity extends WelcomeActivity {
    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.welcome_background)
                .page(new BasicPage(R.drawable.ic_welcome_page_1,
                        getString(R.string.welcomePageTitle1),
                        getString(R.string.welcomePageText1))
                )
                .page(new BasicPage(R.drawable.ic_welcome_page_2,
                        getString(R.string.welcomePageTitle2),
                        getString(R.string.welcomePageText2))
                )
                .page(new BasicPage(R.drawable.ic_welcome_page_3,
                        getString(R.string.welcomePageTitle3),
                        getString(R.string.welcomePageText3))
                )
                .swipeToDismiss(true)
                .build();
}
}
