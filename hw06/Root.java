////////////////////
//Shaun Kenney
//cse2
//hw06
//Root
//
// program has user input a double greater than 0
//      program then uses while loops and if statements
// to calculate the square root
//
//import scanner class
import java.util.Scanner;
//  define a class
public class Root {
    //main method required
    public static void main(String arg[]) {
        //declare instance of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner=new Scanner(System.in);
        //prompt the user for a double greater than 0
        System.out.print("Enter a double that is greater than 0. ");
    
        //defines user input variable
        double userInput=myScanner.nextDouble();
       
        //creates if statement ensuring that user inputs a value GREATER THAN 0
        if(userInput<=0) {
            //prints out the error
            System.out.println("You neglected to follow directions and enter a double greater than 0 ");
            //stops the code
            return;
        }
        //defines the tolerance variable
        double toleranceLevel=0.0000001;
        //defines low variable    
        double low=0;
        //defines high variable as input plus 1
        double high=userInput+1;
        //defines middle variable as high + low divided by 2
        double Middle=(high+low)/2;
        //define difference variable as high minus low
        double Difference=high-low;
            //creates while statement that compares Difference to toleranceLevel
            //this says to keep running the loop until Difference is < than toleranceLevel
            while((Difference)>(toleranceLevel)) {
        
        //if statement that says if Middle squared is greater than userInput (the number)
        //then give the value of Middle to variable high
        if((Middle*Middle)>userInput) {
            high=Middle;
            //keeps variable low the same
            low=low;
            //re-defines the middle variable to allow for updated values
            Middle=(high+low)/2;
        //else statement that infers that middle squared is less than userInput    
        }else{
            //gives the value of middle to variable low
            low=Middle;
            //keeps high the same
            high=high;
            //redefines middle
            Middle=(high+low)/2;
           
        }   //ends up updating Difference as either the high or low value has changed
            Difference=high-low;
        }
        
        //spits out the root
        System.out.println(high);
        
   
    }
    
}