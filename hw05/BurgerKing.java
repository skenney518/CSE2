//////////////////////////////////////////////////////////////////////
//Shaun Kenney
//9/29/2014
//
//cse02
//hw05
//BurgerKing
//
//
//
//import scanner class
import java.util.Scanner;
//create a class
public class BurgerKing {
    public static void main(String [] args) {
        
    Scanner myScanner;
    
    myScanner=new Scanner(System.in);

    System.out.print("Enter a letter to indicate a choice of ");
    System.out.print("      Burger (B or b) ");
    System.out.print("      Soda (S or s) ");
    System.out.print("      Fries (F or f) ");
    
    String firstAnswer=myScanner.next();
    
    int Length=firstAnswer.length();
    
    switch(Length) {
        case 1:
            break;
        
        default:
            System.out.println("Single character expected. Please try again. ");
            return;
    }
    
    char charOne= firstAnswer.charAt(0);
    
    
    switch (charOne) {
        case 'B':
        case 'b':
            System.out.print("Enter A or a for 'all the fixins' ");
            System.out.print("      C or c for cheese ");
            System.out.print("      N or n for none of the above ");
            
            String secondAnswer=myScanner.next();
            int lengthTwo=secondAnswer.length();
            
            switch(lengthTwo) {
                case 1:
                    break;
                
                default:
                    System.out.println("Single character expected. Please try again. ");
                    return;
            }
            
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
                    
                default:
                    System.out.println("You did not enter any of 'A,a,C,c,N,n' choices. ");
                    return;
            }
            
        case 'S':
        case 's':
            System.out.print("Do you want Pepsi (P or p) ");
            System.out.print("Coke (C or c) ");
            System.out.print("Sprite (S or s) ");
            System.out.print("or Mountain Dew (M or m) ? ");
            
            String thirdAnswer=myScanner.next();
            
            int lengthThree=thirdAnswer.length();
            
            switch(lengthThree) {
                case 1:
                    break;
                    
                default:
                    System.out.println("Single character expected. Please try again. ");
                    return;
            }
            
            
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
                    
                default:
                    System.out.println("You did not enter of the valid choices. ");
                    return;
            }
        
        case 'F':
        case 'f':
            System.out.println("You ordered Fries. ");
            return;
            
        
        
        default:
            System.out.println("You did not enter any of the valid choices. ");
            return;
    }
        
    }
}
