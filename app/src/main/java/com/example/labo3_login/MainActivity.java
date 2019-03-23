package com.example.labo3_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.labo3_login.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass, email, otro;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        email = findViewById(R.id.email);
        otro = findViewById(R.id.otro);
        login = findViewById(R.id.login);

        login.setOnClickListener(view->{
            String text = user.getText().toString();
            String text1 = pass.getText().toString();
            String text2 = email.getText().toString();
            String text3 = otro.getText().toString();
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstant.TEXT_USER, text);
            mIntent.putExtra(AppConstant.TEXT_PASS, text1);
            mIntent.putExtra(AppConstant.TEXT_EMAIL, text2);
            mIntent.putExtra(AppConstant.TEXT_OTRO, text3);
            startActivity(mIntent);
        });
    }
}
