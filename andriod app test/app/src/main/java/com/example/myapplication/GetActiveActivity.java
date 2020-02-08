package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GetActiveActivity extends AppCompatActivity {
    private ImageButton button_pose1;
    private ImageButton button_pose2;
    private ImageButton button_pose3;
    private ImageButton button_pose4;
    private Button HomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_active);

        button_pose1 = (ImageButton)findViewById(R.id.pose1);
        button_pose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoseActivity();
            }
        });
        button_pose2 = (ImageButton)findViewById(R.id.pose2);
        button_pose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoseActivity();
            }
        });
        button_pose3 = (ImageButton)findViewById(R.id.pose3);
        button_pose3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoseActivity();
            }
        });
        button_pose4 = (ImageButton)findViewById(R.id.pose4);
        button_pose4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoseActivity();
            }
        });

        HomeButton = findViewById(R.id.HomeButton);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFeedActivity();
            }
        });
    }
    public void openPoseActivity(){
        Intent intent = new Intent(this, PoseActivity.class);
        startActivity(intent);
    }
    public void openFeedActivity(){
        Intent intent = new Intent(this, FeedActivity.class);
        startActivity(intent);
    }

}
