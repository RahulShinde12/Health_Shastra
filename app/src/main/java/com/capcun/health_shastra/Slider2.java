package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Slider2 extends AppCompatActivity {

    Button slid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider2);

        slid = findViewById(R.id.slider2);
        slid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Slider2.this, Slider3.class);
                startActivity(i); // invoke the SecondActivity.
            }
        });
    }

}