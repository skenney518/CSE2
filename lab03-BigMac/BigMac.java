///////////////////////////////////////////////////
//Shaun Kenney
//9/12/14
//
//cse02
//lab-03
//BigMac
//
//  first compile the program
//      javac BigMac.java
//  run the program
//      java BigMac
//
//  program computes the cost of buying some BigMacs
//      uses the scanner class to obtain the number of BigMacs, cost per, and than tax
//  program then displays the total cost
//
//  import the scanner class
import java.util.Scanner;
// define a class
public class BigMac {
    //main method required for every Java program
    public static void main(String[] args) {
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner = new Scanner( System.in );
    //prompt the user for number of BigMacs
    System.out.print(
     "Enter the number of Big Macs(an integer > 0): ");
    //necesary to accept user input
    int nBigMacs = myScanner.nextInt();
    
    //prompt the user for cost per and sales tax
    System.out.print("Enter the cost per Big Mac as"+
     " a double (in the form xx.xx): ");
    double bigMac$ = myScanner.nextDouble();
    System.out.print(
     "Enter the percent tax as a whole number (xx): ");
    double taxRate = myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want
        //proportion
    
    //print out output
    double cost$;
    int dollars, //whole dollar amount of cost
          dimes, pennies; //for storing digits
              //to the right of the decimal point
              //for the cost$
    cost$ = nBigMacs*bigMac$*(1+taxRate);
    //get the whole amount, dropping decimal fraction
    dollars=(int)cost$;
    //get dimes amount, e.g.,
    // (int)(6.73*10) %10 -> 67 % 10-> 7
    //  where the % (mod) operator ruturns the remainder 
    //  after the division:     583%100 -> 83, 27%5 -> 2
    dimes=(int)(cost$*10)%10;
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" +
    " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    
    }
}