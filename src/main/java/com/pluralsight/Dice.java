package com.pluralsight;

public class Dice {

    //!Creating a method that generates a random number
    public int roll(int minValue, int maxValue) {

        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;
        return randomNumber;
    }

}
