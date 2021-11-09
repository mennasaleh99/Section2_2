package com.example.navigationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Intent intt= new Intent(getApplicationContext(),MyService.class);
        Button startBTN=(Button) findViewById(R.id.startbtn);
        startBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startService(intt);
            }
        });

        Button stopBTN=(Button) findViewById(R.id.stopbtn);
        stopBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intt);
            }
        });

        Button home =(Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Back();
            }
        });
    }

public void Back(){
        startActivity(new Intent(this,MainActivity.class));
}
}