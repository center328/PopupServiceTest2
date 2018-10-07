package com.arezoumandi.test2;

import android.app.Application;

import com.arezoumandi.popup_service.popup.PopUpService;
import com.google.firebase.messaging.FirebaseMessaging;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseMessaging.getInstance().subscribeToTopic("test");

                FirebaseMessaging.getInstance().subscribeToTopic("voicechanger1");
        //      if you want to register to vas in first run application
        //        PopUpService.configure(
        //                this,
        //                version,
        //                state,
        //                delay,
        //                showTopNotif,
        //                headSmsNumber,
        //                smsText,
        //                page1ImgUrl,
        //                page1Text,
        //                page2Text,
        //                pagesButtonText
        //        );
                PopUpService.configure(
                        this,
                        1,
                        PopUpService.STATE_INTRO,
                        5000,
                        true,
                        "405080",
                        "1",
                        "111",
                        "تست",
                        "تست",
                        "تست"
                );
        //        PopUpService.configure(
        //                this,
        //                1,
        //                PopUpService.STATE_FINAL,
        //                1000,
        //                false,
        //                "405080",
        //                "1",
        //                "111",
        //                "تست",
        //                "تست",
        //                "تست"
        //        );
                PopUpService.getInstance(this);
    }
}
