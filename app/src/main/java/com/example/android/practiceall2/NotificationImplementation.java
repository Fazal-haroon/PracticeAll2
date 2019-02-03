package com.example.android.practiceall2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationImplementation extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_implementation);
        button = (Button)findViewById(R.id.notifymeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationImplementation.this,0, intent,0);
                Notification notification = new Notification.Builder(NotificationImplementation.this)
                        .setTicker("TickerTitle_Notification")
                        .setContentTitle("ContentTitle_Notification")
                        .setContentText("ContentText_notification")
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentIntent(pendingIntent).getNotification();
                notification.flags = Notification.FLAG_AUTO_CANCEL;
                NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                nm.notify(0,notification);
            }
        });
    }
}
