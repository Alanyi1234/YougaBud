package com.example.myapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PoseActivity extends AppCompatActivity {
    private Button button_back;
    private Button upload_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pose);


        upload_button = findViewById(R.id.button3);
        upload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                ComponentName n = new
                        ComponentName("org.tensorflow.lite.examples.posenet",
                        "org.tensorflow.lite.examples.posenet.CameraActivity");
                i.setComponent(n);
                startActivity(i);
            }
        });


        button_back = findViewById(R.id.back_button_pose);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToGetActiveActivity();
            }
        });
    }

    public void backToGetActiveActivity(){
        Intent intent = new Intent(this, GetActiveActivity.class);
        startActivity(intent);
    }
}
