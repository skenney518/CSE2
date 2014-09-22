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
import java.util.Scanner;
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
    
    //ensuring the user inputted an int
    if(myScanner.hasNextInt()) {
        int Month=myScanner.nextInt();
    
    
    //ensuring the user inputted a positive, non zero, int 
    if(Month<=0) {
        System.out.println("You did not enter a positive integer, try again.");
        return;
    }
    
    //isolating input of 2, so we can differentiate between leap years
    if(Month==2) {
        System.out.print("Enter an integer representing the year. ");
        //variables
        double Year=(myScanner.nextInt());
        double dividedYear=Year / 4;
        int Days1=29;
        int Days2=28;
        dividedYear=dividedYear-(int)dividedYear;
        
    //computing whether or not Feb had 28 or 29 days on that year    
    if(dividedYear==0) {
        System.out.println("This month has "+Days1+" days");
        
    }else{
        System.out.println("This month has "+Days2+" days");
        }}
    
    //These months have 31 days
    if(Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12) {
        double Days=31;
        System.out.println("This month has "+Days+" days");
    }
    
    //these months have 30 days
    if(Month==4||Month==6||Month==9||Month==11) {
        double Days=30;
        System.out.println("This month has "+Days+" days");
    }
        
    //else statement shuting off code, if user inputs a non-integer
    }else{
        System.out.println("You did not enter a positive integer, try again. ");
        return;
    }
    }
}