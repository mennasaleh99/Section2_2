package com.example.navigationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button button =(Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity2();
            }
        });

        Button btn2=(Button) findViewById(R.id.ser);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Service();
            }
        });
    }
    public void Activity2(){
        EditText txt1=(EditText) findViewById(R.id.text_1);
        EditText txt2=(EditText) findViewById(R.id.text_2);

        Intent intent =new Intent(this,NewActivity.class);
//        the 1 method
        Bundle bun=new Bundle();
        bun.putString("FirstText",txt1.getText().toString());
        intent.putExtras(bun);
// equivilant method
        intent.putExtra("SecondText",txt2.getText().toString());
        startActivity(intent);
    }

    public void Service(){
        startActivity(new Intent(this,ServiceActivity.class));
    }
}