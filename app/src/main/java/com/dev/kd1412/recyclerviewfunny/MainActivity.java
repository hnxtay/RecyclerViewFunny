package com.dev.kd1412.recyclerviewfunny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
        img = (ImageView) findViewById(R.id.img);

        RequestOptions requestOptions = new RequestOptions();
        Glide.with(img).load("https://i.imgur.com/S9mtTxM.jpg")
                .apply(requestOptions.transform(new CenterCrop(),new RoundedCorners(500))).into(img);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Food.class);
                startActivity(intent);
            }
        });
    }


}
