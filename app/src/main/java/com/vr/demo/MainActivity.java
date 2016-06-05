package com.vr.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mVrImage;
    private Button mVrImageFromRemote;
    private Button mVrVideo;
    private Button mVrVideoFromRemote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVrImage = (Button) findViewById(R.id.vrImage);
        mVrVideo = (Button) findViewById(R.id.vrVideo);
        mVrImageFromRemote = (Button) findViewById(R.id.vrImageRemote);
        mVrVideoFromRemote = (Button) findViewById(R.id.vrVideoRemote);

        mVrImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , VRImageActivity.class);
                startActivity(i);
            }
        });

        mVrImageFromRemote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , VRImageFromRemote.class);
                startActivity(i);
            }
        });

        mVrVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , VRVideoActivity.class);
                startActivity(i);
            }
        });

        mVrVideoFromRemote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this , VRVideoFromRemote.class);
                startActivity(i);
            }
        });
    }


}
