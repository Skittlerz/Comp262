package com.comp262.acb.notifications;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

/**
 * Created by acb on 2017-05-13.
 */

public class NotificationView extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        //---look up the notification manager service---
        NotificationManager nm = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        //---cancel the notification that we started---
        nm.cancel(getIntent().getExtras().getInt("notificationID"));
    }

}
