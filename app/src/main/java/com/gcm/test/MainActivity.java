package com.gcm.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.safeon.pushlib.MyJobIntentService;

public class MainActivity extends AppCompatActivity {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        ((Button)findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // JOBIntentService 실행
                Intent i = new Intent(mContext, MyJobIntentService.class);  //is any of that needed?  idk.
                MyJobIntentService.enqueueWork(mContext,i);
            }
        });
    }
}
