package com.example.saharsh.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int val=0;

    public void imageTapped(View view){

        if(val==0)
        {
            ImageView myTapped=(ImageView) view;
            myTapped.setImageResource(R.drawable.cross);
            myTapped.animate().rotation(360).setDuration(1000);
            val=1;
        } else
        {
            ImageView myTapped=(ImageView) view;
            myTapped.setImageResource(R.drawable.circle);
            myTapped.animate().rotation(360).setDuration(1000);
            val=0;
        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
