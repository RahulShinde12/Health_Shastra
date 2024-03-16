package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.capcun.health_shastra.AddNewUser.AddNewUserApiResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUp extends AppCompatActivity {

    private CheckBox agreeCheckBox;

    EditText fname,lname,age,email,phone,pass,con_pass;
    Button create;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fname = findViewById(R.id.first_name);
        lname = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.age);
        pass = findViewById(R.id.password);
        con_pass = findViewById(R.id.confirm_password);
        age = findViewById(R.id.age);

        create = findViewById(R.id.create_account);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //retriving text from edittext's
                String fname_dt = fname.getText().toString().trim();
                String lname_dt = lname.getText().toString().trim();
                String contact_dt = phone.getText().toString().trim();
                String email_dt = email.getText().toString().trim();
                String age_dt = age.getText().toString().trim();
                String pass1 = pass.getText().toString().trim();
                String pass2 = con_pass.getText().toString().trim();



                //checking or validating that is any edittext is empty
                if (!fname_dt.equals("")) {
                    if (!lname_dt.equals("")) {
                        if (!contact_dt.equals("")) {
                            //int amount_dt1 = Integer.parseInt(amount_dt);
                            if (!email_dt.equals("")) {
                                if (!age_dt.equals("")) {

                                    if (!pass1.equals("")) {
                                        if (!pass2.equals("")) {
                                            if (pass1.equals(pass2)) {
                                                createAccount(fname_dt,lname_dt,contact_dt,email_dt,age_dt,pass1);
                                            } else {
                                                con_pass.setError("Please enter same password..!");
                                            }
                                        } else {
                                            con_pass.setError("Please enter same password..!");
                                        }
                                    } else {
                                        pass.setError("Please enter password..!");
                                    }

                                } else {
                                    age.setError("Enter Age");
                                }
                            } else {
                                email.setError("Enter email id");
                            }
                        } else {
                            phone.setError("Please enter contact details..!");
                        }

                    } else {
                        lname.setError("Please enter last name..!");
                    }
                } else {
                    fname.setError("Please enter first name..!");
                }
            }
        });

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

    private void createAccount(String fname_dt, String lname_dt, String contact_dt, String email_dt, String age_dt, String pass1) {


//        SharedPreferences sharedPreferences = getSharedPreferences(sharedPreferencesFileTitle, MODE_PRIVATE);


        Call<AddNewUserApiResponseModel> call = ApiControlller
                .getInstance()
                .getAddNewUserApiSet()
                .addNewUser(fname_dt,lname_dt,contact_dt,email_dt, age_dt,pass1);

        call.enqueue(new Callback<AddNewUserApiResponseModel>() {
            @Override
            public void onResponse(Call<AddNewUserApiResponseModel> call, Response<AddNewUserApiResponseModel> response) {
                AddNewUserApiResponseModel newUserApiResponseModel = response.body();
                String res_msg = newUserApiResponseModel.getMessage();

                if (res_msg.equals("already_present")) {
                    Toast.makeText(SignUp.this, "Account with this contact details already present..!!", Toast.LENGTH_SHORT).show();
                    phone.setText("");
                    phone.findFocus();
                } else if (res_msg.equals("success")) {

                    Toast.makeText(SignUp.this, "Account with " + fname_dt + " is added successfully..!!", Toast.LENGTH_SHORT).show();

                    Intent home_intent = new Intent(SignUp.this, Dashboard.class);
                    home_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(home_intent);
                } else {
                    Toast.makeText(SignUp.this, "Something went wrong please try again later", Toast.LENGTH_SHORT).show();
                    Intent home_intent = new Intent(SignUp.this, Login.class);
                    home_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(home_intent);
                }
            }

            @Override
            public void onFailure(Call<AddNewUserApiResponseModel> call, Throwable t) {
                Toast.makeText(SignUp.this, "Something went wrong please try again later !", Toast.LENGTH_SHORT).show();
                Intent home_intent = new Intent(SignUp.this, Login.class);
                home_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home_intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent home = new Intent(SignUp.this, Login.class);
        home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(home);
    }




}