package com.example.android.practiceall2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class MyService2 extends Service {
    private final IBinder iBinder = new LocalBinder();
    private final Random mGenerator = new Random();

    public class LocalBinder extends Binder{
        MyService2 getService2(){
            return MyService2.this;
        }
    }
    public MyService2() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    public int getRendom(){
        return mGenerator.nextInt(200);
    }
}
