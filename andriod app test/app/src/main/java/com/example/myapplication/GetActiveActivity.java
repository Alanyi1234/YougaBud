package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GetActiveActivity extends AppCompatActivity {
    private Button button_pose1;
    private Button HomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_active);

        button_pose1 = (Button) findViewById(R.id.button5);
        HomeButton = findViewById(R.id.HomeButton);

        button_pose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoseActivity();
            }
        });
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
