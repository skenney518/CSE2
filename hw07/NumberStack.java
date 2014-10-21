//////////////////////////////////////////
//Shaun Kenney
//10/19/2014
//
//cse02
//hw07
//NumberStacks
//
//
//  program has user put in an int between 1 and 9
//  program than uses 3 techniques to print out a structure that looks like the empire state building
//      these 3 techniques are: for loops, while loops, and do while loops
//
//
//
//import scanner class
import java.util.Scanner;
//define a class
public class NumberStack {
    //main method required
    public static void main(String[] args) {
        //declare instance of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner=new Scanner(System.in);
        //prompt the user for int between 1 and 9
        System.out.print("Enter an int between 1 and 9- ");
        //initializes input
        int input=0;
        //uses if statement to verify the input is an int
        if(myScanner.hasNextInt()) {
            //makes input the int that user inputted
            input=myScanner.nextInt();
        //if statement ensuring it isn't below 1 or above 9
        }if(input<1 || input>9) {
            //prints out error message and stops program if so
            System.out.print("You did not follow the directions ");
            return;
        }
        //creates counter variable; giving it the value of 0
        int counter=0;
        //creates a string with 8 spaces, needed to center the lines
        String space=" "+" "+" "+" "+" "+" "+" "+" ";
        //creates a string with 1 dash, we end up adding on dashes as we go
        String dash="-";
        //creates a numbers variable with value: counter+1;
        int numbers=counter+1;
        //creates a string which prints out the value of numbers
        String digits=""+numbers;
        //creates a second numbers variable with the value of numbers+1
        int numbersTwo=numbers+1;
        //initializes variable "line"
        String line;
        //initializes and sets counterTwo to 0
        int counterTwo=0;
        //prints out the title
        System.out.println("");
        System.out.println("Using for loops:");
        //for loop which ends up producing the empire state building
        for(counter=0;counter<input;counter++) {
                //sets counterTwo to 0
                counterTwo=0;
                //sets line as the variable space next to the variable digits
                line=""+space+""+digits;
                //prints out variable line
                System.out.println(line);
                //another for loop where it produces the correct number of rows
                for(counterTwo=1;counterTwo<numbers;counterTwo++) {
                    
                //prints out line
                System.out.println(line);
                }
                //prints out the spaces and dashes
                System.out.println(space+(dash));
    
                //replaces a space with a no space
                space=space.replaceFirst(" ", "");
                //replaces a dash with 3 dashes
                dash=dash.replaceFirst("-","---");
                //replaces the variable numbers with the variable numbersTwo
                digits=digits.replace(""+numbers,""+numbersTwo);
                //adds 1 to numbers
                numbers+=1;
                //adds 1 to numbersTwo
                numbersTwo=numbers+1;
                //recalculates digits
                digits=digits+""+numbers+""+numbers;      
                
                
            }
            
        //prints out a blank line to seperate the empire state buildings
        System.out.println("");
        //prints the title
        System.out.println("Using while loops: ");
        //resets counter to 0
        counter=0;
        //resets counterTwo to 0
        counterTwo=0;
        //resets space to a string having 8 spaces
        space=" "+" "+" "+" "+" "+" "+" "+" ";
        
        dash="-";
        //resets dash to having 1 dash
        numbers=counter+1;
        //resets numbers to counter +1

        digits=""+numbers;
        //resets digits to a string displaying numbers
        numbersTwo=numbers+1;
        //resets numbersTwo to numbers+1

        while(counter<input) {
            //while loop which keeps track of counter

            line=""+space+""+digits;
            //resets line at the top of loop, in turn resetting it everytime
   
            counterTwo=0;
            //brings counterTwo to top, to bring it to 0 every time
            while(counterTwo<(numbers)) {
                //while loop which prints out line the same number of times as numbers
                System.out.println(line);
                //adds 1 to counterTwo
                counterTwo++;
                
            }
            
            //redefines numbers as counter+1
            numbers=counter+1;
            //prints out the line next to the line dash
            System.out.println(space+(dash));
            //replaces first space with a non space
            space=space.replaceFirst(" ","");
            //replaces one dash with 3 dashes
            dash=dash.replaceFirst("-","---");
            //replaces numbers with numbersTwo
            digits=digits.replace(""+numbers,""+numbersTwo);
            //adds 1 to numbers
            numbers+=1;
            //makes numbersTwo numbers+1
            numbersTwo=numbers+1;
            //redefines digits
            digits=digits+""+numbers+""+numbers;
            //adds 1 to counter
            counter++;
            
            
            }
        //spaces out the empire state buildings
        System.out.println("");
        //displays the title
        System.out.println("Using do-while loops");
        
        //redefines counter as 0  
        counter=0;
        //redefines counterTwo as 0
        counterTwo=0;
        //redefines space as having 8 spaces
        space=" "+" "+" "+" "+" "+" "+" "+" ";
        //redefines dash as having 1 dash
        dash="-";
        //redefines numbers as counter+1
        numbers=counter+1;
        //redefines digits as displaying numbers
        digits=""+numbers;
        //redefines numbersTwo as numbers+1
        numbersTwo=numbers+1;
       
    
        
        do{
            //redefines line at top of loop to ensure repetition
            line=""+space+""+digits;
            //redefines counterTwo at top of loop to ensure repetition throughout loop
            counterTwo=0;
            
            //do statement which prints out line and adds 1 to counterTwo
            do {
                System.out.println(line);
                counterTwo++;
             
            //while statement which keeps track of counterTwo with respect to numbers   
            }while(counterTwo<(numbers));
            
            //redefines numbers as counter+1
            numbers=counter+1;
            //prints out space next to dash
            System.out.println(space+(dash));
           
            //replaces a space with no space
            space=space.replaceFirst(" ","");
            //replaces one dash with three dashes
            dash=dash.replaceFirst("-","---");
            //replaces numbers with numbersTwo
            digits=digits.replace(""+numbers,""+numbersTwo);
            //adds 1 to numbers
            numbers+=1;
            //redefines numbersTwo as numbers+1
            numbersTwo=numbers+1;
           
            //redefines digits
            digits=digits+""+numbers+""+numbers;
            //adds 1 to counter
            counter++;
           
             //keeps track of counter in respect to input
            }while(counter<input);
            
            
    }
}