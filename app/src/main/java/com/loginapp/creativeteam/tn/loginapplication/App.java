package com.loginapp.creativeteam.tn.loginapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("q1uTD3i7taVG0y8eORR7oruaoMK8Bm10ntLg18bL")
                // if defined
                .clientKey("z6v7OlEV23DkRgeutC9ZIEUbwmqoxyk54cwMCumD")
                .server("https://parseapi.back4app.com/")
                .build()
        );

        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
