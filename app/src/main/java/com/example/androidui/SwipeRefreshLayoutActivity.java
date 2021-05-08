package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class SwipeRefreshLayoutActivity extends AppCompatActivity {

    private TextView textView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_refresh_layout);

        textView = findViewById(R.id.swipeText);
        SwipeRefreshLayout swipeRefreshLayout = findViewById(R.id.swipeRefresh);
        // 设置刷新进度条的颜色
        swipeRefreshLayout.setColorSchemeColors(Color.BLUE);
        swipeRefreshLayout.setOnRefreshListener(() -> {
            count = count+1;
            textView.setText("下拉刷新第 " + count + " 次");
            // 设置刷新完成，否则会一直处于刷新状态
            swipeRefreshLayout.setRefreshing(false);
        });
    }
}