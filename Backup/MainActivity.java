package com.ijzepeda.weknow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button onlineBtn=(Button)findViewById(R.id.online);
        Button offlineBtn=(Button)findViewById(R.id.offline);
        onlineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Toast.makeText(getApplication(),getString(R.string.login_first),Toast.LENGTH_SHORT).show();
            }
        });
        offlineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent offlineMode=new Intent(getApplication(),Offline.class);
                startActivity(offlineMode);
            }
        });



    }
}
