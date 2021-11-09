package com.example.navigationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        button =(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity1();
            }
        });
//  reading data
        EditText edt1=(EditText) findViewById(R.id.textt_1);
        EditText edt2=(EditText) findViewById(R.id.texxt_2);

        Bundle b=getIntent().getExtras();
        String msg=b.getString("FirstText");
        String msg2=b.getString("SecondText");

        edt1.setText("First "+msg);
        edt2.setText("Second "+msg2);
    }
    public void Activity1(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}