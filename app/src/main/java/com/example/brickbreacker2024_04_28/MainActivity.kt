package com.example.brickbreacker2024_04_28

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for the main activity
        setContentView(R.layout.activity_main)
        // Keep the screen on during the main activity
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    // Method to start the game when the start button is clicked
    fun startGame(view: View?) {
        // Create an instance of GameView
        val gameView = GameView(this)
        // Set the content view to the GameView, switching to the game screen
        setContentView(gameView)
    }
}