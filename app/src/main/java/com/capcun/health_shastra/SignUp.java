package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private CheckBox agreeCheckBox;

    EditText fname,lname,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        agreeCheckBox = findViewById(R.id.agreeCheckBox);

        agreeCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // User has checked the checkbox, perform necessary actions
                    Toast.makeText(SignUp.this, "Terms and conditions agreed!", Toast.LENGTH_SHORT).show();
                } else {
                    // User has unchecked the checkbox, perform necessary actions
                }
            }
        });

    }
}