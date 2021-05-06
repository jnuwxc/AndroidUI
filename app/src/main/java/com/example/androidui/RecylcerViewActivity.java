package com.example.androidui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecylcerViewActivity extends AppCompatActivity {


    private List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylcer_view);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapterR adapter = new FruitAdapterR(fruitList);
        recyclerView.setAdapter(adapter);

    }

    private void initFruits(){
        for(int i = 0; i < 7; i++){
            fruitList.add(new Fruit("apple", R.drawable.apple_pic));
            fruitList.add(new Fruit("banana", R.drawable.banana_pic));
            fruitList.add(new Fruit("orange", R.drawable.orange_pic));
        }
    }
}