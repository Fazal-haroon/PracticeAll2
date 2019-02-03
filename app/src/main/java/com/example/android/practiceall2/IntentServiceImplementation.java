package com.example.android.practiceall2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntentServiceImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_service_implementation);
        Button button = (Button)findViewById(R.id.startsService);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        startService(new Intent(IntentServiceImplementation.this, MyService.class));
                Toast.makeText(IntentServiceImplementation.this, "service started", Toast.LENGTH_SHORT).show();
            }
        });
        Button butoon1 = (Button)findViewById(R.id.stopsService);
        butoon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        stopService(new Intent(IntentServiceImplementation.this, MyService.class));
                Toast.makeText(IntentServiceImplementation.this, "service stoped", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
