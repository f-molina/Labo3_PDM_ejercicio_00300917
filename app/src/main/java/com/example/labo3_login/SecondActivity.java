package com.example.labo3_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3_login.utils.AppConstant;

public class SecondActivity extends AppCompatActivity {

    private TextView mUser, mPassword, mEmail, mOtro;
    private Button mShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mUser = findViewById(R.id.second_user);
        mPassword = findViewById(R.id.second_pass);
        mEmail = findViewById(R.id.second_email);
        mOtro = findViewById(R.id.second_otro);
        mShare = findViewById(R.id.share);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            mUser.setText(mIntent.getStringExtra(AppConstant.TEXT_USER));
            mPassword.setText(mIntent.getStringExtra(AppConstant.TEXT_PASS));
            mEmail.setText(mIntent.getStringExtra(AppConstant.TEXT_EMAIL));
            mOtro.setText(mIntent.getStringExtra(AppConstant.TEXT_OTRO));
        }

        mShare.setOnClickListener(v->{
            String text = mUser.getText().toString();
            String text1 = mPassword.getText().toString();
            String text2 = mEmail.getText().toString();
            String text3 = mOtro.getText().toString();
            Intent shareIntent = new Intent();
            shareIntent.setType("text/plain");
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(AppConstant.TEXT_USER, text);
            shareIntent.putExtra(AppConstant.TEXT_PASS, text1);
            shareIntent.putExtra(AppConstant.TEXT_EMAIL, text2);
            shareIntent.putExtra(AppConstant.TEXT_OTRO, text3);
            startActivity(shareIntent);
        });
    }
}
