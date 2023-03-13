package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer brid;
    MediaPlayer cat;
    MediaPlayer dog;
    int a = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brid = MediaPlayer.create(this, R.raw.brid);
        cat = MediaPlayer.create(this, R.raw.cat);
        dog = MediaPlayer.create(this, R.raw.dog);
    }


    public void cat(View view) {
	system.out.println(a);
        cat.start();
    }

    public void brid(View view) {
        brid.start();
    }

    public void dog(View view) {
        dog.start();
    }
}
