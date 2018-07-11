package com.santoshnayak.wificontroller;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button turn_on, turn_off;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        turn_on= (Button) findViewById(R.id.turnon);
        turn_off= (Button) findViewById(R.id.turnoff);



        turn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager= (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(true);
                Toast.makeText(MainActivity.this, "Wifi turned on", Toast.LENGTH_SHORT).show();

            }
        });

        turn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wifiManager= (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifiManager.setWifiEnabled(false);
                Toast.makeText(MainActivity.this, "Wifi turned off", Toast.LENGTH_SHORT).show();



            }
        });
    }
}
