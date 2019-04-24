package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storyTextView;
    Button upperButton;
    Button lowerButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        upperButton = findViewById(R.id.buttonTop);
        lowerButton = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        upperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Distini", "Upped Button Pressed!");
                if(mStoryIndex ==1){
                    mStoryIndex =3;
                    Log.d("Destini", "mStoryIndex:>"+mStoryIndex);
                }
                else if(mStoryIndex==2){
                    mStoryIndex=3;
                }
                else if(mStoryIndex==3){
                    Log.d("Destini", "mStoryIndex:>"+mStoryIndex);
                    mStoryIndex = 6;
                }
                updateStory(mStoryIndex);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        lowerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Distini", "Lower Button Pressed!");
                if(mStoryIndex ==1){
                    mStoryIndex = 2;
                }
                else if(mStoryIndex==2){
                    Log.d("Destini","In Else lower!");
                    mStoryIndex = 4;
                }
                else if(mStoryIndex==3){
                    mStoryIndex = 5;
                }
                updateStory(mStoryIndex);
            }
        });

    }

    public void updateStory(int index){

        Log.d("Value of index:", "mStoryIndex:>"+mStoryIndex);
        if(index == 1){
            storyTextView.setText(R.string.T1_Story);
            upperButton.setText(R.string.T1_Ans1);
            lowerButton.setText(R.string.T1_Ans2);
        }
        if(index == 2){
            storyTextView.setText(R.string.T2_Story);
            upperButton.setText(R.string.T2_Ans1);
            lowerButton.setText(R.string.T2_Ans2);
        }

        if(index == 3){
            storyTextView.setText(R.string.T3_Story);
            upperButton.setText(R.string.T3_Ans1);
            lowerButton.setText(R.string.T3_Ans2);
        }
        if(index == 4){
            storyTextView.setText(R.string.T4_End);
            upperButton.setVisibility(View.INVISIBLE);
            lowerButton.setVisibility(View.INVISIBLE);
        }
        if(index == 5){
            storyTextView.setText(R.string.T5_End);
            upperButton.setVisibility(View.GONE);
            lowerButton.setVisibility(View.GONE);
        }
        if(index == 6){
            storyTextView.setText(R.string.T6_End);
            upperButton.setVisibility(View.GONE);
            lowerButton.setVisibility(View.GONE);
        }

    }//End updateStory

}
