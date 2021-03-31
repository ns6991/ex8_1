package com.example.ex8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import static android.graphics.Color.BLUE;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    ToggleButton toggleButton;
    Button button;
    LinearLayout linearLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = (Switch) findViewById(R.id.switch1);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        button = (Button) findViewById(R.id.button);
        linearLayout = findViewById(R.id.all);

    }

    public void clicked(View view) {
        if(switch1.isChecked() && toggleButton.isChecked()){
            linearLayout.setBackgroundColor(Color.RED);
        }
        else if(switch1.isChecked() && !toggleButton.isChecked()){
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        else if(!switch1.isChecked() && toggleButton.isChecked()){
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        else {
            linearLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}