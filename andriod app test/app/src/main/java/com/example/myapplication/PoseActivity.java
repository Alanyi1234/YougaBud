package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PoseActivity extends AppCompatActivity {

    private Button button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pose);

        button_back = (Button) findViewById(R.id.button5);
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
