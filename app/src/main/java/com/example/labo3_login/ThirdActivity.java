package com.example.labo3_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3_login.utils.AppConstant;

public class ThirdActivity extends AppCompatActivity {

    private TextView tUser, tPassword, tEmail, tOtro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tUser = findViewById(R.id.second_user);
        tPassword = findViewById(R.id.second_pass);
        tEmail = findViewById(R.id.second_email);
        tOtro = findViewById(R.id.second_otro);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            tUser.setText(mIntent.getStringExtra(AppConstant.TEXT_USER));
            tPassword.setText(mIntent.getStringExtra(AppConstant.TEXT_PASS));
            tEmail.setText(mIntent.getStringExtra(AppConstant.TEXT_EMAIL));
            tOtro.setText(mIntent.getStringExtra(AppConstant.TEXT_OTRO));
        }
    }
}
