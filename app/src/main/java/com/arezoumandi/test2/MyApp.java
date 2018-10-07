package com.arezoumandi.test2;

import android.app.Application;

import com.arezoumandi.popup_service.popup.PopUpService;
import com.google.firebase.messaging.FirebaseMessaging;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseMessaging.getInstance().subscribeToTopic("test");

//        PopUpService.START_DELAY = 5000; => delay millisecond for start popup when app started
//
//        PopUpService.SHOW_TOP_NOTIFICATION = false; => if true when push notification received top action notification has been show to use default is false
//
//        statuses:
//          STATE_INTRO = "STATE_INTRO"; => service popup start after START_DELAY delay millisecond when app started
//          STATE_CONFIRM = "STATE_CONFIRM";
//          STATE_FINAL = "STATE_FINAL"; => service popup never start
//
//        PopUpService.setState(PopUpService.STATE_INTRO);
        PopUpService.getInstance(this);
    }
}
