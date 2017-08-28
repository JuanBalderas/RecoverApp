package com.coffesoftware.recoverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void filesActivity(View view){
        Intent intent = new Intent(this, FileActivity.class);
        startActivity(intent);
    }

    public void contactsActivity(View view){
        Intent intent2 = new Intent(this, ContactActivity.class);
        startActivity(intent2);
    }
}
