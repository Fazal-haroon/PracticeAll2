package com.example.android.practiceall2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btnDatePicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DatePickerImplementation.class);
                startActivity(intent);
            }
        });
        Button button1 = (Button)findViewById(R.id.btnNotification);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotificationImplementation.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button)findViewById(R.id.btnActionBar);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityA.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button)findViewById(R.id.btnImplicitExplicit);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImplicitFromApp1.class);
                startActivity(intent);
            }
        });
        Button button4  = (Button)findViewById(R.id.btnService);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServiceImplementation.class));
            }
        });
        Button button5  = (Button)findViewById(R.id.btnIntentService);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, IntentServiceImplementation.class));
            }
        });
        Button button6  = (Button)findViewById(R.id.btnBoundService);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BoundServiceImplementation.class));
            }
        });
        Button button7  = (Button)findViewById(R.id.btnNavigation);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NavigationDrawerActivity.class));
            }
        });
    }
}
