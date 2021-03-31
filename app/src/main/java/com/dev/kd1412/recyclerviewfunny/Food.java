package com.dev.kd1412.recyclerviewfunny;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MotionEvent;

import com.dev.kd1412.recyclerviewfunny.adapter.FoodAdapter;

import java.util.ArrayList;

public class Food extends AppCompatActivity {
    private RecyclerView rcv;
    private com.dev.kd1412.recyclerviewfunny.model.Food food;
    private ArrayList<com.dev.kd1412.recyclerviewfunny.model.Food> songArrayList;
    private FoodAdapter foodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        initView();
    }
    private void initView() {

        rcv = findViewById(R.id.rcv);
        rcv.setHasFixedSize(true);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        food = new com.dev.kd1412.recyclerviewfunny.model.Food("","");
        songArrayList = new ArrayList<>();
        for (int i =0; i<4; ++i){
            songArrayList.add(food);
            songArrayList.add(food);
            songArrayList.add(food);
            songArrayList.add(food);
            songArrayList.add(food);
        }


        rcv.setAdapter(foodAdapter);
        rcv.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

    }
}
