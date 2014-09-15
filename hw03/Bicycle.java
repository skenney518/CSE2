///////////////////////////////////////
//Shaun Kenney
//9/15/2014
//
//cse02
//hw03
//Bicycle
//
//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle
//
// program prompts the user to enter 2 digits
//      first- the number of counts on a cyclometer
//      second- the number of seconds
// prints out distance traveled
//      and average miles per hour
//
// import the scanner class
import java.util.Scanner;
// define a class
public class Bicycle {
    //main method required for every Java program
    public static void main(String[] args) {
        
    // our intermediate variables and output data
    double wheelDiamater=27.0;
    double PI=3.14159;
    double feetPerMile=5280;
    double inchesPerFoot=12;
    double secondsPerMinute=60;
    double Time;
    double Distance;
    double averageMPH;
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in );
    //prompt the user for the number of counts on a cyclometer
    System.out.print(
     "Enter the number of counts (an integer > 0): ");
    //necesary to accept user input
    int nCounts=myScanner.nextInt();
    
    //prompt the user for the number of seconds durring which the counts occured
    System.out.print("Enter the number of seconds (an integer > 0): ");
    int nSeconds=myScanner.nextInt();
    
    //creates equations for distance and time
    Distance=nCounts*wheelDiamater*PI/inchesPerFoot/feetPerMile;
    Time=nSeconds/secondsPerMinute;
    averageMPH=(Distance)/(Time/60);
    
    //type cast to limit to two digits after decimal point
    Distance=(int)(Distance*100) / 100.0;
    Time=(int)(Time*100) / 100.0;
    averageMPH=(int)(averageMPH*100) / 100.0;
    
    //print out the output data of distance, time, and average mph
    System.out.println("The distance was "+Distance+" miles and took "+Time+" minutes.");
    System.out.println("The average mph was "+averageMPH+".");
    
    
    //
    }
}