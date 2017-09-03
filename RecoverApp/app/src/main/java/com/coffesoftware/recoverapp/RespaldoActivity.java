package com.coffesoftware.recoverapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by fernando on 2/09/17.
 */

public class RespaldoActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respaldo);
        final ProgressBar simpleProgressBar= (ProgressBar) findViewById(R.id.simpleProgressBar);
        Button button=(Button ) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                simpleProgressBar.setVisibility(View.VISIBLE);
            }
        });
}


}
