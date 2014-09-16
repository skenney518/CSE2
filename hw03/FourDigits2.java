//////////////////////////////
//Shaun Kenney
//9/15/2014
//
//cse02
//hw03
//FourDigits
//
//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits
//
// program prompts user to enter a double
//      program then prints out the first four digits to the right of the decimal point
//
// import the scanner class
import java.util.Scanner;
//define a class
public class FourDigits2 {
    //main method required for every Java program
    public static void main(String[] args) {
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in );
    //prompt the user for a double
    System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
    //necesary to accept user input
    double userDouble=myScanner.nextDouble();
    int userDigits=((int)(userDouble*10000.0)-((int)(userDouble)*10000));
    String formatted = String.format("%04d" , userDigits);
    System.out.println("The four digits to the right of the decimal point are " + formatted);
    
    
    }
}