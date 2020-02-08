package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GetActiveActivity extends AppCompatActivity {
    private Button button_pose1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_active);

        button_pose1 = (Button) findViewById(R.id.button5);
        button_pose1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPoseActivity();
            }
        });
    }
    public void openPoseActivity(){
        Intent intent = new Intent(this, PoseActivity.class);
        startActivity(intent);
    }
}
