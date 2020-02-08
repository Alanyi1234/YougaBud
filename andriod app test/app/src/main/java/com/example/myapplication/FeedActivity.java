package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedActivity extends AppCompatActivity {
    private Button getActiveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);

        getActiveButton = (Button) findViewById(R.id.GetActiveButton);
        getActiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGetActiveActivity();
            }
        });
    }

    public void openGetActiveActivity(){
        Intent intent = new Intent(this, GetActiveActivity.class);
        startActivity(intent);
    }
}
