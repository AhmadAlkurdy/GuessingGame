/*
an application that plays "guess the number" as follows:  Your program chooses
the number to be guessed by selecting a random integer in the range 1 to 1000.  
The application displays the prompt "Guess a number between 1 and 1000."   The 
player inputs a first guess.  If the player's guess is incorrect, your program
should display "Too high.  Try again."  Or "Too low.  Try again."  to help the 
player zero in on the correct answer.  The program should prompt the user for 
the next guess.  When the user enters the correct answer, display "Congratulations,
you guessed the number!", and allow the user to choose whether to play agin.  
[Note: The guessing technique employed in this problem is similar to a binary search]
Name: Ahmad Alkurdy
date: 2-15-17

 */
package guessinggame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ahmad
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       //declaring variables to hold the values
        int rnumber = 0;
        int guessno = 0; 
        //random generating method is called
       Random generator = new Random();
       //the random number will be held in rnumber
       rnumber = 1+ generator.nextInt(1000);
       
       //prompting the user to insert the guessed number and store it in guessno
       System.out.println("Guess a number between 1 and 1000");
       guessno = input.nextInt(); 
       
       //while loop to check if the number equal, bigger, or smaller
       while(guessno != rnumber)
       {
           //the number is bigger so we inform the user
           if(guessno > rnumber)
           {
           System.out.println("Too high. Try again");
           }
           
           //the number is smaller so we inform the user
           else if(guessno<rnumber)
           {
               System.out.println("Too low. Try again");
           }
           
               System.out.println("Guess a number between 1 and 1000");
               guessno= input.nextInt();
           
       //the number is equal so we inform the user
       if(guessno == rnumber) //if equally found then message
       {
           System.out.println("Congratualations. You guessed the number!");
       }
    }
    }
    }
    

