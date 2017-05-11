package com.example.mariam.andriodui_cs496;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    EditText input;
    private Button to_fahrenheit;
    private Button to_celsius;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        input = (EditText) findViewById(R.id.act1_input);
        //to_fahrenheit = (Button) findViewById(R.id.toFahrenheit);
        //to_celsius = (Button) findViewById(R.id.toCelsius);
        output = (TextView) findViewById(R.id.act1_output);
    }

    public void convertToFahrenheit(View v){
        double temperature = new Double(input.getText().toString());
        double answer = ((temperature*9)/5)+32;
        output.setText(new Double(answer).toString());
    }

    public void convertToCelsius(View v){
        double temperature = new Double(input.getText().toString());
        double answer = (((temperature-32)*5)/9);
        output.setText(new Double(answer).toString());

    }
}
