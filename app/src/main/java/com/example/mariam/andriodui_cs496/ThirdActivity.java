package com.example.mariam.andriodui_cs496;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        b1 = (Button)findViewById(R.id.act3_1);
        b2 = (Button)findViewById(R.id.act3_2);
        b3 = (Button)findViewById(R.id.act3_3);
        b4 = (Button)findViewById(R.id.act3_4);
        b5 = (Button)findViewById(R.id.act3_5);
        b6 = (Button)findViewById(R.id.act3_6);
        b7 = (Button)findViewById(R.id.act3_7);
        b8 = (Button)findViewById(R.id.act3_8);
        b9 = (Button)findViewById(R.id.act3_9);
        output = (TextView)findViewById(R.id.act3_output);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b1.getText().toString());
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b2.getText().toString());
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b3.getText().toString());
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b4.getText().toString());
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b5.getText().toString());
            }
        });


        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b6.getText().toString());
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b7.getText().toString());
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b8.getText().toString());
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.append(b9.getText().toString());
            }
        });

    }

    public void cleard(View v){
        output.setText("");
    }

}
