package com.example.zhuan.homesweethome;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FurnitureActivity extends AppCompatActivity {

    ViewPager viewpager;
    PicAdapter PA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture);

        viewpager = findViewById(R.id.slider);
        PA = new PicAdapter(this);

        viewpager.setAdapter(PA);

        Button btn = findViewById(R.id.angry_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HelloSceneformActivity.class);
                startActivity(intent);
            }
        });
    }
}
