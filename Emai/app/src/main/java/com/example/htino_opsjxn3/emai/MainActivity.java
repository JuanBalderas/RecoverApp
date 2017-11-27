package com.example.htino_opsjxn3.emai;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TelephonyManager manager;
    TextView txtmensaje;

    @SuppressLint("HardwareIds")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmensaje = (TextView) findViewById(R.id.mi_emai);
        manager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        StringBuilder builder = new StringBuilder();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        builder.append("Imei: ").append(manager.getDeviceId()).append("\n");
        builder.append("Nombre Operador").append(manager.getNetworkOperatorName());

        txtmensaje.setText("Quiubbuuuu");
    }
}
