//Write a program to guess the number by computer.

import java.util.*;

public class NumberGuessingGame{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        //Number of trial
        int trial = 0;
        int low = 1;
        int high = 100;
        int guessNum;
        String feedback;
    System.out.println("guess a number between 1 and 100");

    do{
    guessNum = (int)(Math.random() * (high-low+1)) + low;
    trial++;
    System.out.println("The number is : " + guessNum);
        System.out.println("Enter feedback : high, low or correct");
    feedback = sc.next();
    //if the number is too high
        if(feedback.equals("high")){
            high = guessNum - 1;
        }
        //if the number is too low
        else if(feedback.equals("low")){
            low = guessNum + 1;
        }
        //number is correct
    else{
        System.out.println("Gussed Number is correct");
        }
        }while(!feedback.equals("correct") && trial<5);

        //Print if the guess count is over
    if(trial==5){
    System.out.println("Out of tries");
    }
    }
}