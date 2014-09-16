///////////////////////////////////////
//Shaun Kenney
//9/15/2014
//
//cse02
//hw03
//Root
//
//  first compile the program
//      javac Root.java
//  run the program
//      java Root
//
// program prompts the user to enter a double
//      program then prints out a estimate of the cubed root of that double
// Finally the program prints out the estimate^3
//
// import the scanner class
import java.util.Scanner;
// define a class
public class Root {
    //main method required for every java program
    public static void main(String[] args) {
    
    // our variables
    double estimateOne;
    double estimateCubed;
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in );
    //prompt the user for any double
    System.out.print("Enter a double: ");
    //necesary to accept user input
    double userDouble=myScanner.nextDouble();
    
    //creates equations for estimate
    estimateOne=userDouble/ 3;
    estimateOne=(2*estimateOne*estimateOne*estimateOne+userDouble)/(3*estimateOne*estimateOne);
    estimateOne=(2*estimateOne*estimateOne*estimateOne+userDouble)/(3*estimateOne*estimateOne);
    estimateOne=(2*estimateOne*estimateOne*estimateOne+userDouble)/(3*estimateOne*estimateOne);
    estimateOne=(2*estimateOne*estimateOne*estimateOne+userDouble)/(3*estimateOne*estimateOne);
    estimateOne=(2*estimateOne*estimateOne*estimateOne+userDouble)/(3*estimateOne*estimateOne);
    estimateCubed=(estimateOne*estimateOne*estimateOne);
    
    //print out the estimate
    System.out.println("The cube root is "+estimateOne);
    //print out the proof
    System.out.println(+estimateOne+"*"+estimateOne+"*"+estimateOne+" = "+estimateCubed+".");
    
    }
}
