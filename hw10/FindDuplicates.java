//Shaun Kenney
//11/17/2014
//cse00000010
//FindDuplicates
//
// program has user put in 10 ints
//      then it says whether or not there are any duplicates
//  then goes a step further to see if there is exactly 1 duplicate
//
//
//
//
//
//
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    // initializes scanner
    int num[]=new int[10];
    // initializes array with 10 slots
    String answer="";
    // initializes answer to a blank string
    do{
        // do statement to have user put in 10 ints
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      // has a general statement
      out+=listArray(num); //return a string of the form "{2, 3, -9}" 
      // adds the numbers to the string
      if(hasDups(num)){
          // checks for duplicates
        out+="has ";
      }
      else{
        out+="does not have ";
        // checks if does not have duplicates
      }
      out+="duplicates.";
      // adds duplicates to the string
      System.out.println(out);
      // prints out
      out="The array ";
      // this goes to check if it has exactly 1 duplicate
      out+=listArray(num);    
      // adds array values
      if(exactlyOneDup(num)){
          // checks if it has exactly 1 duplicate
        out+="has ";
      }
      else{
        out+="does not have ";
        // else, it does not
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      // prints out
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      // asks to go again
      answer=scan.next();
      // scans the answer
    }while(answer.equals("Y") || answer.equals("y"));
        // checks to see if they answered yes
  }

  public static String listArray(int num[]){
      // initializes method
    String out="{";
    // used in print statement
    for(int j=0;j<num.length;j++){
        // for statement saying to place commas in print statement
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }

    
    
public static boolean hasDups(int num[]) {
    // initializes new method, brings in array
   int duplicate=0;
   // value of 0
   int counter=0;
   // value of 0
   int counterTwo=0;
   // value of 0
   for(int zero=0; zero<num.length; zero++) {
       // for statement to run for length of array: num
    for(counterTwo=0; counterTwo<num.length; counterTwo++) {
        // for statement to run for length of num
        if(num[counterTwo] == num[counter]) {
            // checks to see if they're the same
            duplicate+=1;
            // adds 1 to the counter
            
    }
}
        counter++;
        // adds 1 to counter
}
    if(duplicate>10) {
        //since the way I set it up, there are always 1 duplicate for each for loop cycle, as the index of say 4 will always equal the index of 4
        // and so the minimum number on the variable duplicate will be 10, so if there's more than 10, that means there is a duplicate
        return true;
        // returns true if this is the case
    }else{
        // else, there are no duplicates
        return false;
    }
    

}

public static boolean exactlyOneDup(int num[]){
    // method
    int duplicate=0;
    // value of 0
    int counter=0;
    // value of 0
    int counterTwo=0;
    // value of 0
    for(int zero=0; zero<num.length; zero++) {
        // for loop, runs number of times equal to length of array num
        for(counterTwo=0; counterTwo<num.length; counterTwo++) {
            // look above
            if(num[counterTwo] == num[counter]) {
                // checks for duplicates
                duplicate+=1;
                // adds 1 to counter: duplicate
            
            }
        
        }
        counter++;
        // adds 1 to counter counter
    }
    if(duplicate==12) {
        // if the duplicates equal 12, means there is exactly 1 duplicate
        return true;
    }else{
        return false;
    }
}
}


