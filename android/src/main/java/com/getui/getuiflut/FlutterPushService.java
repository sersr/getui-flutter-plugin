package com.getui.getuiflut;


import android.content.Intent;

import com.igexin.sdk.PushService;

public class FlutterPushService extends PushService {

    @Override
    public int onStartCommand(Intent intent, int i, int i1) {
        super.onStartCommand(intent, i, i1);
        return START_STICKY;
    }
}
