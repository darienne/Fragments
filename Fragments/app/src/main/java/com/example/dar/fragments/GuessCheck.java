package com.example.dar.fragments;

/**
 * Created by seanr on 3/27/2018.
 */

public class GuessCheck
{
    int randomNumber;

    public GuessCheck(int randomNumber)
    {
        setRandomNumber(randomNumber);
    }

    public void setRandomNumber(int number)
    {
        randomNumber = number;
    }

    public int getRandomNumber(){return randomNumber;}


    public String  checkGuess(int guess)
    {
        if(guess >= 1 ||  guess <= 100)
        {
            if(guess == randomNumber)
            {
                return "You got it!";
            }
            else if (guess <=  randomNumber)
            {
                return "Too low!";
            }
            else if(guess >= randomNumber)
            {
                return "Too High!";
            }
        }

        return "Not even close!";
    }
}
