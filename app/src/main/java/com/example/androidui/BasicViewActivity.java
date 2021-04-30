package com.example.androidui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BasicViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_view);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(it->{
            new AlertDialog.Builder(this)
                    .setTitle("标题")
                    .setMessage("这是一个AlertDialog")
                    .setCancelable(false)
                    .setPositiveButton("ok", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    })
                    .setNegativeButton("cancel", (dialog ,which)->{

                    }).show();
        });
    }
}