package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Slider1 extends AppCompatActivity {

    Button slid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider1);

        slid = findViewById(R.id.slider1);
        slid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Slider1.this, Slider2.class);
                startActivity(i); // invoke the SecondActivity.
            }
        });


    }
}