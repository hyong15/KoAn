package com.example.hyong.koan.feature.surfaceviewdemo;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hyong.koan.feature.R;

public class SurfaceViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_view_demo);
        final ZanView zanView = findViewById(R.id.zanview);
        zanView.start();
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ZanBean zanBean = new ZanBean(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_demo), zanView);
                zanView.addZanXin(zanBean);
            }
        });
    }
}
