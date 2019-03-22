package com.example.labo3_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView user, password, email, otro;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        user = findViewById(R.id.second_user);
        password = findViewById(R.id.second_pass);
        email = findViewById(R.id.second_email);
        otro = findViewById(R.id.second_otro);
        mShare = findViewById(R.id.share);
        Intent mIntent =getIntent();
        if (mIntent != null) {
            user.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            password.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            email.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
            otro.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }

        mShare.setOnClickListener(v->{
            String text = user.getText().toString();
            String text1 = password.getText().toString();
            String text2 = email.getText().toString();
            String text3 = otro.getText().toString();
            Intent shareIntent = new Intent();
            shareIntent.setType("text/plain");
            shareIntent.setAction(Intent.ACTION_SEND);
            startActivity(shareIntent);
        });
    }
}
