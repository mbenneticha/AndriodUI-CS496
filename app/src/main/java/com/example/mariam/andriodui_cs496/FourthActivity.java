package com.example.mariam.andriodui_cs496;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView title;
    Integer[] images = {R.drawable.batman, R.drawable.flash, R.drawable.superman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        title = (TextView)findViewById(R.id.act4_name);

    }

    public void batClick(View v){
        View myView =  this.findViewById(R.id.RelativeLayout02);
        myView.setBackgroundResource(images[0]);
        title.setTextColor(Color.WHITE);
    }

    public void supersClick(View v){
        View myView =  this.findViewById(R.id.RelativeLayout02);
        myView.setBackgroundResource(images[2]);
        title.setTextColor(Color.WHITE);
    }

    public void flashClick(View v){
        View myView =  this.findViewById(R.id.RelativeLayout02);
        myView.setBackgroundResource(images[1]);
        title.setTextColor(Color.WHITE);
    }
}
