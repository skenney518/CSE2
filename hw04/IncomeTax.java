///////////////////////////////////////////////
//Shaun Kenney
//9/19/2014
//
//cse02
//hw04
//Income Tax
//
//  first compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax
//  program has user input an integer representing the income in thousands
//      program than prints the income tax, depending on category of income
//
//  import scanner class
import java.util.Scanner;
//  define a class
public class IncomeTax {
    //main method required for every java program
    public static void main(String[] args) {
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in);
    //prompt the user for int of income
    System.out.print("Enter an int > 0 giving the number of thousands. ");
  
    //necesary to accept user input
    if(myScanner.hasNextInt()) {
        //define variables
        int incomeNumber$=myScanner.nextInt();

    //if statement ensuring integer is possitve and not 0
    if(incomeNumber$<=0) {
        System.out.println("You did not enter a positive integer.");
        return;
        
    }
    
    //following if statements are used to decide which tax rate the input falls under
    if(incomeNumber$<20) {
        double taxRate5$=5;
        double totalTax5$=(incomeNumber$*1000)*taxRate5$/100;
        System.out.println("The tax rate on $"+incomeNumber$+",000 is "+taxRate5$+"% and the tax is $"+totalTax5$);
    }
    
    if(incomeNumber$>=20 && incomeNumber$<40) {
        double taxRate7$=7;
        double totalTax7$=(incomeNumber$*1000)*taxRate7$/100;
        totalTax7$=((int)totalTax7$*100)/100.0;
        System.out.println("The tax rate on $"+incomeNumber$+",000 is "+taxRate7$+"% and the tax is $"+totalTax7$);
    }
    
    if(incomeNumber$>=40 && incomeNumber$<78) {
        double taxRate12$=12;
        double totalTax12$=(incomeNumber$*1000)*taxRate12$/100;
        totalTax12$=((int)totalTax12$*100)/100.0;
        System.out.println("The taxrate on $"+incomeNumber$+",000 is "+taxRate12$+"% and the tax is $"+totalTax12$);
        
    }
    
    if(incomeNumber$>=78) {
        double taxRate14$=14;
        double totalTax14$=(incomeNumber$*1000)*taxRate14$/100;
        totalTax14$=((int)totalTax14$*100)/100.0;
        System.out.println("The taxrate on $"+incomeNumber$+",000 is "+taxRate14$+"% and the tax is $"+totalTax14$);
    }
    //program shuts off code is input is negative or 0
    }else{
        System.out.println("You did not enter a positive integer. Try again");
        return;
    }
    }
}