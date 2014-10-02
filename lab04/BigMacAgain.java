////////////////////////////////////
//Shaun Kenney
//9/19/2014
//
//cse02
//lab04
//BigMacAgain
//
//  first compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain
//
//  program prompts the user to enter a number of BigMacs
//      program then asks if they want fries
//  program then prints out total cost of meal
//
//  import the scanner class
import java.util.Scanner;
//  define a class
public class BigMacAgain {
    //main method required for every Java program
    public static void main(String[] args) {
    
    //declare instance of Scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in);
    //prompt the user for number of BigMacs
    System.out.print("Enter the number of Big Macs(an integer > 0): ");
    //necesary to accept user input
    if(myScanner.hasNextInt()) {
        //define variables
        int nBigMacs=myScanner.nextInt();
        double cost$;
        double costPer$=2.22;
     
        //creates pricing equation
        cost$=(int)(nBigMacs*costPer$*100) / 100.0;
        double totalFries$=(int)((cost$ + 2.15)*100) / 100.0;
        
        //if statement for ensuring input isn't negative or 0        
        if(nBigMacs>0){
            System.out.println("The total cost of "+nBigMacs+" Big Macs at $"+costPer$+" is $"+cost$+".");
         

        }else{
            System.out.println("You did not enter a positive integer.");
            return;
        }
 
        //asks user if they want to buy fries
        System.out.print("Do you want an order of fries? Y/y or N/n ? ");
    
        //makes the string Answer equal the user input
        String Answer= myScanner.next();
        //if user inputs 'Y' or 'y', it prints t he cost of fries
        //and then the cost of the total bill
        if((Answer.equals("Y")) || (Answer.equals("y"))) {
        
            double Total=cost$ + 2.15;
            System.out.println("You ordered fries at $2.15. ");
            System.out.println("The total cost of the meal is $"+totalFries$+". " );
        
        }
       
        //if user inputs 'n' or 'N' it prints the total cost of bill
        if((Answer.equals("N")) || (Answer.equals("n"))) {
            System.out.println("The total cost of the meal is $"+cost$+". ");
            
        }
        
        //if user inputs none of the 4 choices it prints an error message
        if((!Answer.equals("N")) && (!Answer.equals("n")) && (!Answer.equals("Y")) && (!Answer.equals("y"))) {
            System.out.println("You did not enter one of the 'y' , 'Y' , 'n' , 'N' choices. ");
            return;
          
        }
       
    }else{
        System.out.println("You did not enter a positive integer.");
        return; //leaves the program (terminates)
    }
    }
}