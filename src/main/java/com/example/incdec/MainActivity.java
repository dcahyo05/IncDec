package com.example.incdec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Number;
    Button Inc, Decr;
    int Count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number = (TextView) findViewById(R.id.NumText);
        Inc = (Button) findViewById(R.id.IncID);
        Decr = (Button)  findViewById(R.id.DecId);

        Inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Count ++;
                Number.setText(String.valueOf(Count));
            }
        });
        Decr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Count--;
                Number.setText(String.valueOf(Count));
            }
        });
    }
}