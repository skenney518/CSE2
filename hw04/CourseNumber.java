////////////////////////////////////////
//Shaun Kenney
//9/20/2014
//
//cse2
//hw04
//CourseNumber
//
//  first compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber
//  program has the user input a course number
//      program then ensures that the number applies to the restrictions
//  program prints out the year, and semester of the course number
//
//  import scanner class
import java.util.Scanner;
//  define a class
public class CourseNumber {
    //main method required
    public static void main(String[] args) {
    
    //declare instance of scanner object
    Scanner myScanner;
    //call the scanner constructor
    myScanner=new Scanner(System.in);
    //prompt the user for a course number
    System.out.print("Enter a six digit number giving the course semester. ");
    
    //ensuring the user inputted an int
    if(myScanner.hasNextInt()) {
        //defining needed variables
        int CourseNumber=myScanner.nextInt();
        int Year=(int)(CourseNumber/100);
        int Semester=(CourseNumber) - (Year*100);
    
    //if statement to ensure number is an integer
    if(CourseNumber<=0) {
        System.out.println("The number was not an integer.");
        return;
    }
    
    //if statement to ensure number is within the range
    if(CourseNumber<186510 || CourseNumber>201440) {
        System.out.println("The number was outside the range [186510,201440].");
        return;
    }
    
    //if statement to ensure Semester number is either 10,20,30, or 40
    if(Semester==10 || Semester==20 || Semester==30 || Semester==40 ) {
        
    }else{
        System.out.println(Semester+" is not a legitimate semester.");
        return;
    
    }

    //if statement to print out Spring semester if = 10
    if(Semester==10) {
        System.out.println("The course was offered in the Spring semester of "+Year);
    }
    
    //if statement for Summer 1 semester
    if(Semester==20) {
        System.out.println("The course was offered in the Summer 1 semester of "+Year);
    }
    
    //if statement for Summer 2 semester
    if(Semester==30) {
        System.out.println("The course was offered in the Summer 2 semester of "+Year);
    }
    
    //if statement for Fall semester
    if(Semester==40) {
        System.out.println("The course was offered in the Fall semester of "+Year);
    
    } 
        
    
    }else{
        System.out.println("The number was not an integer.");
        return;
    }
    }
}