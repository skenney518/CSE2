/////////////////////////////////
//Shaun Kenney
//9/26/2014
//
//cse2
//hw05
//Random Games
//
//  Program asks for user to input "roulette, Craps, or Pick a card"
//      error messages pop up if input isn't 1 character length, 
//  or isn't a correct valid choice
//      if roulette- program prints the result
//  if user picks Craps, program prints results of two dice rolls
//      if user picks P(ick cards), program prints a random card drawl
//
//import scanner class
import java.util.Scanner;
//define a class
public class RandomGames {
    //main method required
    public static void main(String[] args) {
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in);
    //asks user for input
    System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for pick a card ");
    

    // creates variables 'Input'
    String Input=myScanner.next();
    
    //creates 'Length' variable to check the length of the input
    int Length= Input.length();
    
    //switch statement to ensure the input is only 1 character
    switch (Length) {
        case 1:
            break;
            
        //if length does not equal 1 character, it spits out an error message and stops program
        default:
            System.out.println("a single character expected.");
            return;
    }
    
    //creates variable Letter, and puts as char as needed by switch statement
    char Letter= Input.charAt(0);
    
    //creates Output variable (random number) ensuring range as 0-37
    int Output= (int)(Math.random()*38);
    
    //switch staments to check what inputs are
    switch (Letter) {
        //if input is 'r' or 'R' program creates random number
        case 'r' :
            
                switch (Output) {
                    //if random number is 37, program spits out 00
                    case 37:
                        System.out.println("Roulette: 00");
                        return;
                        
                    default:
                        break;
                }
        
            System.out.println("Roulette: "+Output);
            break;
        
        case 'R':
         
                switch (Output) {
                    case 37:
                        System.out.println("Roulette: 00");
                        return;
                    
                    default:
                        break;
                }
            System.out.println("Roulette: "+Output);
            break;
            
        case 'C'|'c' :
            System.out.println("Craps option is not yet implemented. ");
            break;
        
        case 'C':
            System.out.println("Craps option is not yet implemented. ");
            break;
            
        case 'p' :
            System.out.println("Picking a Card is not yet implemented. ");
            break;
            
        case'P':
            System.out.println("Picking a Card is not yet implemented. ");
            break;
        
        default: 
            System.out.println("'"+Input+"' is not one of 'R','r','C','c','P','p'");
            
    }
    }
}