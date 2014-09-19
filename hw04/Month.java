//////////////////////////////
//Shaun Kenney
//9/19/2014
//
//cse02
//hw04
//Month
//
//  first compile the program
//      javac Month.java
//  run the Program
//      java Month
//  program has user input an integer representing a month
//      program then prints out the number of days for that respective month
//  if user inputs 2 for Feb, pogram asks for the year
//
//  import scanner class
impot java.util.Scanner;
//  define a class
public class Month {
    //main method required
    public static void main(String[] args) {
        
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in);
    //prompt the user for int of month
    System.out.print("Enter an int between 1 and 12, representing a month. ");
    
    }
}