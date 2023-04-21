/**
* Project: FizzBuzz Game
* Description: Given a number N, print all number from 1 to N.
* If a number is divisible by 3 print Fizz, if it is divisible by 5
* print Buzz, if divisible by both then print FizzBuzz, and if not divisible by
* both 3 and 5, then print that number.
* Author: Ben Lufuta
* Due Date: April 21st,2023
*/
package fizzbuzz;

import java.util.InputMismatchException;
import java.util.Scanner;


public class FizzBuzz {

    /**
     * Method gameDriver() prompt the user for an input (number that represents 
     * the limit). Checks if the received input is a valid int greater than 1.
     * If it is, then proceed with checking condition of the FizzBuzz game and
     * printing out the values to the screen until the limit number is reached, 
     * otherwise print the appropriate message to the screen and continue to 
     * prompt for a valid input. 
     * 
     */
    public void gameDriver (){
        
        Scanner scan = new Scanner (System.in);
        
        boolean flag = false;

        int number = 0;
        
        while(!flag) {
           
           try {
               
               //Prompt and receive an input from the keyboard.
               System.out.print("Enter a number -->: ");
                number = scan.nextInt();
                
                //if the value received is less than 1. If so, print a message
                //otherwise continue.
                if(number < 1){
                    
                    flag = false;
                    System.out.println("No values less than 1 accepted.");
                    
                } else {
                    
                    flag = true;
                    break;
                }
          
        }  catch (InputMismatchException ime) {
            
            System.out.println("Invalid Value Entered! No letters, decimals, or symbols accepted.");
            scan.next();
        }      
    }
        
       //If a valid value was entered, then proceed with looping and printing out
       //values if is divisible by 3 print Fizz, if it is divisible by 5
       //print Buzz, if divisible by both then print FizzBuzz, and if not divisible by
       //both 3 and 5, then print that number.(Add a tabstop between values).
       
       for (int i = 1; i <= number; i++){
           
           if ((i % 3 == 0) && (i % 5 == 0)){
               
                System.out.print("FizzBuzz\t");
                
           } else if (i % 3 == 0){
               
                System.out.print("Fizz\t");
                
           } else if (i % 5 == 0){
               
                System.out.print("Buzz\t");
                
           } else {
               
               System.out.print(i + "\t");
           }
           
           //Go to the next line if 20 values have been already printed out on this
           //this line. This is just to prevent all values to be printed one line.
           if (i % 20 == 0){
               
               System.out.println();
           } 
       }
       //If the method is called more than once, print out the next call on a 
       //new line.
       System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        
        fizzBuzz.gameDriver();
        
    }
}
