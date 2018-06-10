package com.example.saharsh.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int val=0;
    int[] gameState={2,2,2,2,2,2,2,2,2};

    public void imageTapped(View view){



        ImageView myTapped=(ImageView) view;
        Log.i("tag ","Tag is "+myTapped.getTag().toString());
        int index= Integer.parseInt(myTapped.getTag().toString());

        if(gameState[index]==2) {
            if(val==0)
            {

                myTapped.setImageResource(R.drawable.cross);
                myTapped.animate().rotation(360).setDuration(1000);
                val=1;
                gameState[index]=1;
            } else
            {

                myTapped.setImageResource(R.drawable.circle);
                myTapped.animate().rotation(360).setDuration(1000);
                val=0;
                gameState[index]=1;
            }
        }




    }

    public void playAgainTapped(View view) {
        for(int i=0;i<9;i++) {
            gameState[i]=2;
        }
        val=0;

        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.lay1);
        for(int i=0;i<linearLayout.getChildCount();i++){
            ((ImageView) linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }

        LinearLayout linearLayout1=(LinearLayout)findViewById(R.id.lay2);
        for(int i=0;i<linearLayout1.getChildCount();i++){
            ((ImageView) linearLayout1.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }

        LinearLayout linearLayout3=(LinearLayout)findViewById(R.id.lay3);
        for(int i=0;i<linearLayout3.getChildCount();i++){
            ((ImageView) linearLayout3.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
