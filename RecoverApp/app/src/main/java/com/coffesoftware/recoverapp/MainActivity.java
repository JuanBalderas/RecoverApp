package com.coffesoftware.recoverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}

/*
    public void filesActivity(View view){
        Intent intent = new Intent(this, FileActivity.class);
        startActivity(intent);
    }

    public void contactsActivity(View view){
        Intent intent2 = new Intent(this, ContactosActivity.class);
        startActivity(intent2);
    }

    public void pollActivity(View view){
        Intent intent3 = new Intent(this, EncuestaActivity.class);
        startActivity(intent3);
    }

    public void configActivity(View view){
        Intent intent4 = new Intent(this, ConfigActivity.class);
        startActivity(intent4);
    }

    public void respaldoActivity(View view){
        Intent intent5=new Intent (this, RespaldoActivity.class);
        startActivity(intent5);
    }

}
*/
