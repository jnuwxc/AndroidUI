package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button linearLayoutBtn = findViewById(R.id.linearLayout);
        linearLayoutBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, LinearLayoutActivity.class);
            startActivity(intent);
        });

        Button relativeLayoutBtn = findViewById(R.id.relativeLayout);
        relativeLayoutBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, RelativeLayoutActivity.class);
            startActivity(intent);
        });

        Button frameLayoutBtn = findViewById(R.id.frameLayout);
        frameLayoutBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, FrameLayoutActivity.class);
            startActivity(intent);
        });

        Button constraintLayout = findViewById(R.id.constraintLayout);
        constraintLayout.setOnClickListener(it->{
            Intent intent = new Intent(this, ConstraintLayoutActivtiy.class);
            startActivity(intent);
        });

        Button basicViewBtn = findViewById(R.id.basicView);
        basicViewBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, BasicViewActivity.class);
            startActivity(intent);
        });

        Button mdBtn = findViewById(R.id.md);
        mdBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, MaterialDesignActivity.class);
            startActivity(intent);
        });

        Button listViewBtn = findViewById(R.id.listView);
        listViewBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, ListViewActivity.class);
            startActivity(intent);
        });

        Button recyclerViewBtn = findViewById(R.id.recyclerView);
        recyclerViewBtn.setOnClickListener(it->{
            Intent intent = new Intent(this, RecylcerViewActivity.class);
            startActivity(intent);
        });

        Button viewPagerBtn = findViewById(R.id.viewPager);
        viewPagerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewPagerActivity.class);
            startActivity(intent);
        });
    }

}
