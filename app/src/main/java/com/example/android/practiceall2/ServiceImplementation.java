package com.example.android.practiceall2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServiceImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_implementation);
    }

    public void startService(View view) {
        startService(new Intent(ServiceImplementation.this, TheService.class));
    }

    public void stopService(View view) {
        stopService(new Intent(ServiceImplementation.this, TheService.class));
    }
}
