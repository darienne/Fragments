package com.example.dar.fragments;

/**
 GuessCheck is going to set a random number and have the user input a number and guesscheck the answer.
 * If the user guesses it right then will return you got it.
 * If user does not guess it right then will return to low, to high, or not even close.
 * Created by Group 3-1 on 3/27/2018.
 */

public class GuessCheck
{
    int randomNumber;

    /**
     * GuessCheck contains an integer randomNumber which setRandomNuber will have a param randomNumber.
     * @param randomNumber
     */
    public GuessCheck(int randomNumber)
    {
        setRandomNumber(randomNumber);
    }

    /**
     * setRandomNumber contains an integer number which will have a param number.
     * @param number
     */
    public void setRandomNumber(int number)
    {
        randomNumber = number;
    }

    /**
     * getRandomNumber will return randomNumber.
     * @return
     */
    public int getRandomNumber(){return randomNumber;}


    /**
     * checkGuess will have an if else statement that will determine if the users number entered is correct or off by a little, to much, or not even close.
     * @param guess
     * @return
     */
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
