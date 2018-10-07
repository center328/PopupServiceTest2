package com.arezoumandi.test2;

import android.app.Application;

import com.arezoumandi.popup_service.popup.PopUpService;
import com.google.firebase.messaging.FirebaseMessaging;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseMessaging.getInstance().subscribeToTopic("test");

//        PopUpService.START_DELAY = 5000;
//        PopUpService.setState(PopUpService.STATE_INTRO);
        PopUpService.getInstance(this);
    }
}
