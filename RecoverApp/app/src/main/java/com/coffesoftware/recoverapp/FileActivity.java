package com.coffesoftware.recoverapp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class FileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
    }

    public void verWhatsApp(View view){
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeWhats);

    }
}
