package com.example.android.practiceall2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BoundServiceImplementation extends AppCompatActivity {
    MyService2 myService2;
    boolean isBound = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service_implementation);

        Intent intent = new Intent(BoundServiceImplementation.this, MyService2.class);
        bindService(intent,serviceConnection, Context.BIND_AUTO_CREATE);

        Button button = (Button)findViewById(R.id.randomNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView)findViewById(R.id.boundTextView);
                textView.setText(Integer.toString(myService2.getRendom()));
            }
        });
    }
    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyService2.LocalBinder binder = (MyService2.LocalBinder)service;
            myService2 = binder.getService2();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };
}
