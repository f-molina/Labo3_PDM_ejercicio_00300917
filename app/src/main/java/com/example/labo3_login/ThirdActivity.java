package com.example.labo3_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private TextView user, password, email, otro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        user = findViewById(R.id.second_user);
        password = findViewById(R.id.second_pass);
        email = findViewById(R.id.second_email);
        otro = findViewById(R.id.second_otro);
        Intent mIntent =getIntent();
        if (mIntent != null) {
            user.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            password.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            email.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            otro.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
