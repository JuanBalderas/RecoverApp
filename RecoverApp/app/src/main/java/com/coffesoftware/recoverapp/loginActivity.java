package com.coffesoftware.recoverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void logREG(View view) {

        Intent objT = new Intent(loginActivity.this, registrarActivity.class);
        startActivity(objT);
    }
}
