////////////////////////////////////////////////////////////////////
//Shaun Kenney
//9/29/2014
//
//cse02
//hw05
//BoolaBoola
//
//import scanner class
import java.util.Scanner;
//  define a class
public class BoolaBoola {
    //main method required
    public static void main(String [] args) {
        //declare instance of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner=new Scanner(System.in);
        //prompt the user for int of month
        
        //randomized variable int; gives either 0 or 1
        int intOne=(int)(Math.random()*2);
        
        //variable One is assigned int 1
        int One=1;
        
        //creates 4 more random numbers
        int intTwo=(int)(Math.random()*2);
        int intThree=(int)(Math.random()*2);
        int intFour=(int)(Math.random()*2);
        int intFive=(int)(Math.random()*2);
        
        //creates boolean statements which look to see if variable One is equal to the respective int variables
        boolean booleanOne=One==intOne;
        boolean booleanTwo=One==intTwo;
        boolean booleanThree=One==intThree;
        boolean booleanFour=One==intFour;
        boolean booleanFive=One==intFive;
        
        //creates 5 variables which are strings which we use for "true/false" and "&&/||"
        String variableOne;
        String variableTwo;
        String variableThree;
        String variableFour;
        String variableFive;
        
        
        //if statements saying if respective boolean are true, then the respective strings= "true"
        //else strings="false"
        if (booleanOne==true){
            
            variableOne= "True";
            
        }else{
            variableOne= "False";
        }
        
        if(booleanTwo==true){
            variableTwo= "True";
        }else{
            variableTwo="False";
        }
        
        if(booleanThree==true){
            variableThree="True";
        }else{
            variableThree="False";
        }
        
        //if statements saying if respective booleans are true, then the respective strings ="&&"
        //else strings="||"
        if(booleanFour==true){
            variableFour="&&";
        }else{
            variableFour="||";
        }
        
        if(booleanFive==true){
            variableFive="&&";
        }else{
            variableFive="||";
        }
        
        //prints out statement asking user for input
        //statement is comprised of 5 variables, which are randomized
        //3 variables are either true or false
        //2 variables are either && or ||
        System.out.print("Does " +variableOne+ " " +variableFour+ " " +variableTwo+ " " +variableFive+ " " +variableThree+" have the value true(T/t) or false(F/f) ? ");
        
        
        //grants variable userInput the input
        String userInput=myScanner.next();
        
        //makes the string a char by taking the (0) digit (ensures 1 letter)
        char finalUserInput=userInput.charAt(0);
        
        // says that if either of the 3 true/false variables are falsre
        // then the answer is false
        if((variableOne=="False")||(variableTwo=="False")||(variableThree=="False")) {
            String finalAnswer="False";
        
        
        //following if statements say that if final answer = false and user input= 'f' or 'F'
        // then system prints "correct"
        if((finalAnswer=="False") && (finalUserInput=='f')) {
            System.out.println("Correct. ");
            
            
        
        
        if((finalAnswer=="False") && (finalUserInput=='F')) {
            System.out.println("Correct. ");
            return;
        
        }    
        //else statement says that if not correct, system prints "Wrong Try Again"
        }else{
            System.out.println("Wrong Try Again. ");
            return;
            
        }
        //else statement says that if final answer is not false, then final answer is true
        }else{
            String finalAnswer="True";
        
            
        //if statement say that if final answer is true, and user inputs 't' or 'T'
        //then system prints correct
        if((finalAnswer=="True") && (finalUserInput=='t')) {
            System.out.println("Correct. ");
        
        
        if((finalAnswer=="True") && (finalUserInput=='T')) { 
            System.out.println("Correct. ");
    
        }   
        //else statement says that if not correct, system prints "Wrong Try Again"
        }else{
            System.out.println("Wrong Try Again. ");
        }
    

        }
        
    
    }
}