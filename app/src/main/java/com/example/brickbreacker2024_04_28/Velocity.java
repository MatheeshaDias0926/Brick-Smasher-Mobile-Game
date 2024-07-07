package com.example.brickbreacker2024_04_28;

public class Velocity {

    private int x, y; // Variables to store velocity components

    // Constructor to initialize velocity components
    public Velocity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the x component of velocity
    public int getX() {
        return x;
    }

    // Method to set the x component of velocity
    public void setX(int x) {
        this.x = x;
    }

    // Method to get the y component of velocity
    public int getY() {
        return y;
    }

    // Method to set the y component of velocity
    public void setY(int y) {
        this.y = y;
    }
}
