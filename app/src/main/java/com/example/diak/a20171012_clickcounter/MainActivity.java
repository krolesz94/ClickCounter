package com.example.diak.a20171012_clickcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button plus;
    Button negativ;
    Button reset;
    TextView counterText;
    EditText scoreText;
    int counter = 0;
    int borzalom = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button)findViewById(R.id.button_plusz);
        negativ = (Button) findViewById(R.id.button_neg);
        reset = (Button) findViewById(R.id.button_reset);
        counterText = (TextView) findViewById(R.id.textView);

        plus.setOnClickListener(this);
        negativ.setOnClickListener(this);
        reset.setOnClickListener(this);
    }


    public void onClick(View v){
        if (v==plus){
            counter++;
            counterText.setText(Integer.toString(counter));
            borzalom++;
        }
        if (v==negativ){
            counter--;
            counterText.setText(Integer.toString(counter));
            borzalom++;
        }
        if (v==reset){
            counter = 0;
            counterText.setText(Integer.toString(counter));
        }
        if (borzalom == 20){
            Context context = getApplicationContext();
            CharSequence text = "Unatkozol, mi?";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
