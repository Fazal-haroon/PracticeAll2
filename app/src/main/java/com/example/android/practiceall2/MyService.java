package com.example.android.practiceall2;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class MyService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyService(String name) {
        super("my_intent_service_thread_haroon");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service started", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "service stoped", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this){
            try {
                wait(20000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
