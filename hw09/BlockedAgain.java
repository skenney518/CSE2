//Shaun Kenney
//11/4/2014
//cse2
//hw09
//Blocked Again
//
//
//  program utilizes hw07
//      uses methods instead tho, to simplify code
//  asks user for an int
//      uses one method to ensure int input
//  uses one method to ensure in the range [1,9]
//      takes this int and creates an empire state building structure



import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //initiates m
        m = getInt();
        //calls method getInt
        allBlocks(m);
        //calls method allBlocks
    }
    
    public static int getInt() {
        //method getInt
    Scanner myScanner=new Scanner(System.in);
    //scanner required
    System.out.print("Enter an int in the range: 1 to 9: ");
    //asks for user input
    int n;
    //initializes n
    n=checkInt(myScanner);
    //n equals return from method checkInt, taking myScanner with it to the method
    int o;
    //initalizes o
    o=checkRange(n);
    //0 equals return of method checkRange, taking n with it to the method
    return n;
    //needed to suffice as a return, doesn't effect anything
    }
    
    public static int checkInt(Scanner myScanner) {
        //method checkInt, used to check to see if input is an int

        while(true) {
            //true while loop, to ensure it keeps on running until it's an int
            if(myScanner.hasNextInt()) {
                //if input is in fact an in,
            int y=myScanner.nextInt();
            //variable y takes value of input
            return y;
            // y is returned, which ends the loops
        }else{
            System.out.print("You did not enter an int, try again ");
            //if not an int, ask again
            myScanner.next();
            //command to take next input
        }   
    }
    
}

    public static int checkRange(Integer input) {
        //checkRange method, which checks to see if that int is in fact in the range
        Scanner myScanner=new Scanner(System.in);
        //initalizes myScanner
        while(true) {
            //true while loops to keep on running until int is in the range
            if((input>0) && (input<10)) {
                //if greater than 0 and less than 10,
                return input;
                //return the input, which ends the while loops
            }else{
                System.out.println("If you want to build the Empire State building, you need to enter an int in the range [1,9], but you did not; try again ");
                //if not in the range, print out error
                input=checkInt(myScanner);
                //has input equal to the calling of method checkInt, taking myScanner with it, so it repeats the process
        }
    }
    }
    public static int allBlocks(Integer x) {
        block(x);
        //calls method block, taking x with it
        return x;
    }
    
    public static void block(Integer Block) {
        int counterTwo=0;
        //defines counterTwo as 0
        int counter=0;
        //defines counter as 0
        String space=" "+" "+" "+" "+" "+" "+" "+" ";
        //defines space as having 8 spaces
        String lineOne;
        //initializes lineOne
        int numbers=counter+1;
        //sets numbers to counter +1
        String digits=""+numbers;
        //sets digits as a string showing numbers
        String dash="-";
        //sets dash as having 1 dash
        int numbersTwo=numbers+1;
        //sets numbersTwo as numbers+1
        
        while(counter<Block) {
            //while loop which keeps track of counter
            lineOne=""+space+""+digits;
            //resets line at the top of loop, in turn resetting it everytime
            counterTwo=0;
             //brings counterTwo to top, to bring it to 0 every time
            line(numbers, space, dash, digits, numbersTwo);
            //calls method line
    
                numbers=counter+1;        
                //redefines numbers as counter+1
                 System.out.println(space+(dash));
                 //prints out the line next to the line dash
                space=space.replaceFirst(" ", "");
                //replaces first space with a non space
                dash=dash.replaceFirst("-","---");
                //replaces one dash with 3 dashes
                digits=digits.replace(""+numbers,""+numbersTwo);
                //replaces numbers with numbersTwo
                numbers+=1;
                //adds 1 to numbers
                numbersTwo=numbers+1;
                 //makes numbersTwo numbers+1
                digits=digits+""+numbers+""+numbers;  
                //redefines digits
                
                counter++;
                //adds 1 to counter
    }
    
    }
    public static void line(Integer numbers, String space, String dash, String digits, Integer numbersTwo) {
        int counterTwo=0;
        // defines counterTwo at 0

        String lineOne=""+space+""+digits;
            //resets line at the top of loop, in turn resetting it everytime
        
        while(counterTwo< numbers) {
            //while loop which prints out line the same number of times as numbers
            System.out.println(lineOne);
            //Prints lineOne
            counterTwo++;
            //adds 1 to counterTwo
        }
        }
}
//Empire State of Mind