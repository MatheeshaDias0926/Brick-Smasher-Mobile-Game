package com.example.brickbreacker2024_04_28;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {
    TextView tvPoints; // TextView to display points
    ImageView ivNewHighest; // ImageView to indicate new highest score

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over); // Set the layout for the game over activity
        ivNewHighest = findViewById(R.id.ivNewHeighst); // Initialize ImageView for new highest score indicator
        tvPoints = findViewById(R.id.tvPoints); // Initialize TextView for displaying points
        int points = getIntent().getIntExtra("points", 0); // Get points from intent
        // Check if the player achieved a new highest score
        if (points == 240) {
            ivNewHighest.setVisibility(View.VISIBLE); // Show new highest score indicator
        }
        tvPoints.setText(String.valueOf(points)); // Set the points on TextView
    }

    // Method to restart the game
    public void restart(View view) {
        Intent intent = new Intent(GameOver.this, MainActivity.class); // Create intent to start MainActivity
        startActivity(intent); // Start MainActivity
        finish(); // Finish the current activity (GameOver)
    }

    // Method to exit the game
    public void exit(View view) {
        finish(); // Finish the current activity (GameOver)
    }
}
