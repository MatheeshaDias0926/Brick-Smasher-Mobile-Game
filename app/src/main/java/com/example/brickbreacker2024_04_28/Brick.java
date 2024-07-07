package com.example.brickbreacker2024_04_28;

// Brick class representing a brick in the game
public class Brick {
    private boolean isVisible; // Flag to indicate if the brick is visible
    public int row, column, width, height; // Variables to store brick position and dimensions

    // Constructor to initialize the brick
    public Brick(int row, int column, int width, int height){
        isVisible = true; // Initially, the brick is visible
        this.row = row; // Set the row of the brick
        this.column = column; // Set the column of the brick
        this.width = width; // Set the width of the brick
        this.height = height; // Set the height of the brick
    }

    // Method to set the brick invisible
    public void setInvisible(){
        isVisible = false; // Set the isVisible flag to false
    }

    // Method to check the visibility of the brick
    public boolean getVisibility(){
        return isVisible; // Return the visibility status of the brick
    }
}
