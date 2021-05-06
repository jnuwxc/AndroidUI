package com.example.androidui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapterR extends RecyclerView.Adapter<FruitAdapterR.ViewHolder> {

    private List<Fruit> fruitList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;

        public ViewHolder(View view){
            super(view);
            fruitImage = view.findViewById(R.id.fruitImage);
            fruitName = view.findViewById(R.id.fruitName);
        }
    }

    public FruitAdapterR(List<Fruit> fruitList){
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item_r, parent, false);
        ViewHolder holder = new ViewHolder(view);
        holder.fruitName.setOnClickListener(v -> {
            int position = holder.getAbsoluteAdapterPosition();
            Fruit fruit = fruitList.get(position);
            Toast.makeText(v.getContext(), "you clicked text " + fruit.getName(), Toast.LENGTH_SHORT).show();
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }


}
