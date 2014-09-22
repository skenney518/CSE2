/////////////////////////////////////
//Shaun Kenney
//
//cse2
//hw04
//TimePadding
//
//  first compile the program
//      javac TimePAdding.java
//  run the program
//      java TimePadding
//  program has user input a number of seconds
//      program then prints out the itme in conventional form
//
//import scanner class
import java.util.Scanner;
//  define a class
public class TimePadding {
    //main method required
    public static void main(String[] args) {
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in);
    //prompt the user for int in terms of number of seconds
    System.out.print("Enter the time in seconds." );
    
    //ensuring the user inputted an int
    if(myScanner.hasNextInt()) {
        int Time=myScanner.nextInt();

    //if statement ensuring number is above 0 (non-negative)
    if(Time<=0) {
        System.out.println("You did not enter a positive int, please try again. ");
        return;
    }        
    
    //defining varibales and their equations
    int Hours=(int)(Time / 3600);
    int Minutes=(int)((Time - (Hours*3600)) / 60);
    int Seconds=(int)((Time - (Hours*3600)) - (Minutes*60));
    
    //formatting strings so that vaibale Minutes and Seconds include
    //leading zeros, but the numbers are limited to 2 digits
    //and since they already have 1 digit, there is 1 leading zero
    String formattedMinutes=String.format("%02d" , Minutes);
    String formattedSeconds=String.format("%02d" , Seconds);
    
    System.out.println("The time is     "+Hours+":"+formattedMinutes+":"+formattedSeconds+".");
    
    }else {
        System.out.println("You did not enter an int, please try again. ");
        return;

        
    }
    }
}