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
public class FourDigits {
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
    
    //multiplies the double the user inputs by 10000 and makes it an int (getting rid of unwanted decimal points)
    int userExpanded=(int)(userDouble*10000);
    //divides that new int by 10000 to then bring 4 digits to the right of the decimal point
    //the % tells the code to take only the remainder from dividng by 10000 (the digits on the right of decimal point)
    int userDigits= userExpanded % 10000;
    //formats the created int (the 4 digits to the right of decimal- ie: remainder) to include any leading zeros
    //also caps the int at a 4 digits, although this is only necesary for correct formatting of the code, 
    //as we already ensured this int to have only 4 characters 
    String formatted = String.format("%04d" , userDigits);
    //prints out the newly formatted int
    System.out.println("The four digits to the right of the decimal point are: " + formatted);
    
   
    }
}