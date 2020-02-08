package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeedActivity extends AppCompatActivity {
    private Button getActiveButton;
    private Button addFriendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);

        getActiveButton = findViewById(R.id.GetActiveButton);
        getActiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGetActiveActivity();
            }
        });

        addFriendButton = findViewById(R.id.addFriendButton);
        addFriendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddFriendActivity();
            }
        });

    }
    public void openGetActiveActivity(){
        Intent intent = new Intent(this, GetActiveActivity.class);
        startActivity(intent);
    }

    public void openAddFriendActivity(){
        Intent intent = new Intent(this, AddFriendActivity.class);
        startActivity(intent);
    }

}
