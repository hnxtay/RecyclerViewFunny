package com.dev.kd1412.recyclerviewfunny;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dev.kd1412.recyclerviewfunny.adapter.SongAdapter;
import com.dev.kd1412.recyclerviewfunny.model.Song;

import java.util.ArrayList;

public class Music extends AppCompatActivity {
    private RecyclerView rcv;
    private Song song;
    private ArrayList<Song> songArrayList;
    private SongAdapter songAdapter;
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

        song = new Song("","Hãy trao cho anh","Sơn Tùng");
        Song song1 = new Song("","Vẫn Nhớ ","Soobin Hoàng Sơn");
        Song song2 = new Song("","Tadadada","Xuan Tay");
        songArrayList = new ArrayList<>();
        for (int i =0; i<4; ++i){
            songArrayList.add(song);
            songArrayList.add(song1);
            songArrayList.add(song2);
        }

        songAdapter = new SongAdapter(songArrayList);

        rcv.setAdapter(songAdapter);

    }
}
