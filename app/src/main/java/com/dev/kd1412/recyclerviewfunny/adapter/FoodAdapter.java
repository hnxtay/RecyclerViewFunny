package com.dev.kd1412.recyclerviewfunny.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dev.kd1412.recyclerviewfunny.R;
import com.dev.kd1412.recyclerviewfunny.model.Food;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private ArrayList<Food> foodArrayList;
//    private final View.OnClickListener clickListener = new MyOnclickListener();

    public FoodAdapter(ArrayList<Food> songArrayList) {
        this.foodArrayList = songArrayList;
    }

    Food food;
    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        food = foodArrayList.get(position);
        holder.img.setImageResource(R.drawable.ic_male);
        holder.tv_song.setText(food.getTittle());
    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView tv_song;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            tv_song = (TextView) itemView.findViewById(R.id.tv_song);
        }
    }

    public void Onclick(final  View view){
        return;
    }
}
