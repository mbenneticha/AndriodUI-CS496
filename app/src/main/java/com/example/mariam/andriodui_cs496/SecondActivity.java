package com.example.mariam.andriodui_cs496;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText input;
    RadioButton two_shuffle;
    RadioButton three_shuffle;
    RadioButton four_shuffle;
    RadioButton random_shuffle;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        input = (EditText) findViewById(R.id.act2_input);
        two_shuffle = (RadioButton) findViewById(R.id.radioButton1);
        three_shuffle = (RadioButton) findViewById(R.id.radioButton2);
        four_shuffle = (RadioButton) findViewById(R.id.radioButton3);
        random_shuffle = (RadioButton) findViewById(R.id.radioButton4);
        output = (TextView) findViewById(R.id.act2_output);
    }

    public void shuffleString(View v){

        String shuffled = input.getText().toString();

        if (two_shuffle.isChecked()){
            shuffled = StringShuffle.shuffleByTwo(shuffled);
        }
        else if (three_shuffle.isChecked()){
            shuffled = StringShuffle.shuffleByThree(shuffled);
        }
        else if (four_shuffle.isChecked()){
            shuffled = StringShuffle.shuffleByFour(shuffled);
        }
        else {
            shuffled = StringShuffle.shuffleRandom(shuffled);
        }
        //output.getText().clear();
        output.setText(shuffled);
    }
}
