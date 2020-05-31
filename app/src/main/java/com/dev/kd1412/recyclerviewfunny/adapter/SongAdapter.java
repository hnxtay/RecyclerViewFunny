package com.dev.kd1412.recyclerviewfunny.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.dev.kd1412.recyclerviewfunny.R;
import com.dev.kd1412.recyclerviewfunny.model.Song;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private ArrayList<Song> songArrayList;
//    private final View.OnClickListener clickListener = new MyOnclickListener();

    public SongAdapter(ArrayList<Song> songArrayList) {
        this.songArrayList = songArrayList;
    }

    Song song;
    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder holder, int position) {
        song = songArrayList.get(position);
        holder.img.setImageResource(R.drawable.ic_male);
//        RequestOptions requestOptions = new RequestOptions();
//        Glide.with(holder.img).load("https://i.imgur.com/bRrofWv.jpg")
//                .apply(requestOptions.transform(new CenterCrop(),new RoundedCorners(100)))
//                .into(holder.img);
        holder.tv_song.setText(song.getmSongname());
        holder.tv_singer.setText(song.getmSinger());
    }

    @Override
    public int getItemCount() {
        return songArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView tv_song;
        private TextView tv_singer;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            tv_song = (TextView) itemView.findViewById(R.id.tv_song);
            tv_singer = (TextView) itemView.findViewById(R.id.tv_singer);
        }
    }

    public void Onclick(final  View view){
        return;
    }
}
