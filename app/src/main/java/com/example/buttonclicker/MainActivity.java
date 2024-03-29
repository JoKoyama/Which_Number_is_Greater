package com.example.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set up initial values here
        timesClicked = 0;

        //wiring widgets links the xml to the java
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onClickerClicked(View view) {
        if (timesClicked == 100){
        Toast.makeText(this, "We Did It", Toast.LENGTH_LONG).show();}
        //increased the timeClicked
        timesClicked += 1;
        //show value
        textViewScore.setText("Clicked: " + timesClicked);
        changeBackgroundColor();
    }

    private void changeBackgroundColor() {
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        constraintLayout.setBackgroundColor(rgb(r,g,b));
        textViewScore.setTextColor(rgb(255-r,255-g,255-b));

    }
}
