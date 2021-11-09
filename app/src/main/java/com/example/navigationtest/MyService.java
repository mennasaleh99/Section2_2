package com.example.navigationtest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyService extends Service {

    MediaPlayer mp;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mp.setLooping(true);
        mp.start();
//         alternative of stopService Function
//        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }
}
