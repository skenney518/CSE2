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
    double estimateTwo;
    double estimateThree;
    double estimateFour;
    double estimateFive;
    double estimateSix;
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
    estimateTwo=(2*estimateOne*estimateOne*estimateOne+userDouble)/(3*estimateOne*estimateOne);
    estimateThree=(2*estimateTwo*estimateTwo*estimateTwo+userDouble)/(3*estimateTwo*estimateTwo);
    estimateFour=(2*estimateThree*estimateThree*estimateThree+userDouble)/(3*estimateThree*estimateThree);
    estimateFive=(2*estimateFour*estimateFour*estimateFour+userDouble)/(3*estimateFour*estimateFour);
    estimateSix=(2*estimateFive*estimateFive*estimateFive+userDouble)/(3*estimateFive*estimateFive);
    estimateCubed=(estimateSix*estimateSix*estimateSix);
    
    //print out the estimate
    System.out.println("The cube root is "+estimateSix+":");
    //print out the proof
    System.out.println(+estimateSix+"*"+estimateSix+"*"+estimateSix+" = "+estimateCubed+".");
    
    }
}
