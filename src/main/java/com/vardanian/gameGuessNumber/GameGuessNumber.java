package com.vardanian.gameGuessNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameGuessNumber {

    private int guessNumber;
    private int limitOfRandomNumber;

    public GameGuessNumber() {
    }

    public GameGuessNumber(int limitOfRandomNumber) {
        this.limitOfRandomNumber = limitOfRandomNumber;
        randomNumber();
    }

    public int randomNumber() {
        Random random = new Random();
        this.guessNumber = random.nextInt(limitOfRandomNumber) - 1;
        return guessNumber;
    }

    public boolean tryGuess(int userNumber) {
        if (userNumber > guessNumber) {
            System.out.println("Enter number bigger than guess number");
            System.out.println("Please try again: ");
            return false;
        } else if (userNumber < guessNumber) {
            System.out.println("Enter number smaller than guess number");
            System.out.println("Please try again: ");
            return false;
        } else {
            System.out.println("Congratulation, you guess number");
            return true;
        }
    }

    public static void main(String[] args) {

        boolean gameOver = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number: ");
        GameGuessNumber user = null;
        try {
            user = new GameGuessNumber(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!gameOver) {
            try {
                if (user.tryGuess(Integer.parseInt(reader.readLine())))
                    gameOver = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
