package com.vardanian.gameGuessNumber;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GameGuessNumberTest {

    GameGuessNumber guessNumber = new GameGuessNumber(10);

    @Test
    public void biggerNumberTest() {

        Assert.assertEquals(guessNumber.tryGuess(101), false);
    }

    @Test
    public void smallerNumberTest() {
        Assert.assertEquals(guessNumber.tryGuess(-1), false);
    }
}