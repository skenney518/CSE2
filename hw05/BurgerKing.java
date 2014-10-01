//////////////////////////////////////////////////////////////////////
//Shaun Kenney
//9/29/2014
//
//cse02
//hw05
//BurgerKing
//
//
//program asks user to choose burger soda or fries
//  depending on their decision, program then prints out a second question
//  fixins, pepsi, etc
//  program then prints out what the user ordered
//
//import scanner class
import java.util.Scanner;
//create a class
public class BurgerKing {
    //create a method
    public static void main(String [] args) {
    
    //declare instance of scanner objec
    Scanner myScanner;
    
    //call the scanner constructor
    myScanner=new Scanner(System.in);

    //creates the string that is printed out to user
    System.out.print("Enter a letter to indicate a choice of ");
    System.out.print("      Burger (B or b) ");
    System.out.print("      Soda (S or s) ");
    System.out.print("      Fries (F or f) ");
    
    //creates varibale that uses user's response
    String firstAnswer=myScanner.next();
    
    //creates a variable resembling the length of the input
    int Length=firstAnswer.length();
    
    //makes sure the input is only 1 character
    switch(Length) {
        case 1:
            break;
        
        //if character is not 1 character, it prints out error message
        default:
            System.out.println("Single character expected. Please try again. ");
            return;
    }
    
    //creates variable (input) as a char
    char charOne= firstAnswer.charAt(0);
    
    //prints out statement if b or B is inputted
    switch (charOne) {
        case 'B':
        case 'b':
            System.out.print("Enter A or a for 'all the fixins' ");
            System.out.print("      C or c for cheese ");
            System.out.print("      N or n for none of the above ");
            
            //follow lines ensure the second response is only 1 character
            String secondAnswer=myScanner.next();
            int lengthTwo=secondAnswer.length();
            
            switch(lengthTwo) {
                case 1:
                    break;
                
                default:
                    System.out.println("Single character expected. Please try again. ");
                    return;
            }
            
            //following lines print out the orders depending on what the user inputs
            char charTwo=secondAnswer.charAt(0);
            
            switch(charTwo) {
                case 'A':
                case 'a':
                    System.out.println("You ordered a burger with all the fixins. ");
                    return;
                    
                case 'C':
                case 'c':
                    System.out.println("You ordered a burger with cheese. ");
                    return;
                    
                case 'N':
                case 'n':
                    System.out.println("You ordered a burger none of the listed options. ");
                    return;
                
                //if neither letter is chosen. prints out error message    
                default:
                    System.out.println("You did not enter any of 'A,a,C,c,N,n' choices. ");
                    return;
            }
            
        //prints out yet another response if S or s is chosen    
        case 'S':
        case 's':
            System.out.print("Do you want Pepsi (P or p) ");
            System.out.print("Coke (C or c) ");
            System.out.print("Sprite (S or s) ");
            System.out.print("or Mountain Dew (M or m) ? ");
            
            //following lines ensure input is only 1 character
            String thirdAnswer=myScanner.next();
            
            int lengthThree=thirdAnswer.length();
            
            switch(lengthThree) {
                case 1:
                    break;
                    
                default:
                    System.out.println("Single character expected. Please try again. ");
                    return;
            }
            
            
            //following lines print out the order depending on what user inputs
            char charThree=thirdAnswer.charAt(0);
            
            switch (charThree) {
                
                case 'P':
                case 'p':
                    System.out.println("You ordered a Pepsi. ");
                    return;
                
                case 'C':
                case 'c':
                    System.out.println("You ordered a Coke. ");
                    return;
                    
                case 'S':
                case 's':
                    System.out.println("You ordered a Sprite. ");
                    return;
                    
                case 'M':
                case 'm':
                    System.out.println("You ordered a Mountain Dew. ");
                    return;
                    
                //if none of the letters were chosen, prints out error message
                default:
                    System.out.println("You did not enter of the valid choices. ");
                    return;
            }
        
        //if f or F were chosen, prints out that they ordered fries.
        case 'F':
        case 'f':
            System.out.println("You ordered Fries. ");
            return;
            
        
        
        //if none of the letters were chosen from the initial question, error message appears
        default:
            System.out.println("You did not enter any of the valid choices. ");
            return;
    }
        
    }
}
