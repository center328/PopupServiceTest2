package com.arezoumandi.test2.gcm;

import com.arezoumandi.popup_service.popup.PopUpService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
//      remoteMessage.getString("sms_head_number"),
//      remoteMessage.getString("sms_text"),
//      remoteMessage.getString("page1_text"),
//      remoteMessage.getString("page1_img_url"),
//      remoteMessage.getString("page2_text"),
//      remoteMessage.getString("pages_button_text")
        if (remoteMessage != null)
            PopUpService.getInstance(getApplication()).checkPushNotificationMessage(remoteMessage.getData());

//      ...
//      ...
    }
}