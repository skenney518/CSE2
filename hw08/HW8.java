//Shaun Kenney
//10/28/2014
//cse2
//hw08
//HW8
//
// program utilizes methods to simplify program
//		asks user to input C or c
//	keeps asking until they input an acceptable value
//		then asks for user to input either y Y n or N
//	except htis time there is a limit of 5 times, for the user to input correct value
//		next, user is to input a digit from 0 to 9
//	
//	all of these steps are monitored for a 1 character answer, as well as correct value



//import scanner class
import java.util.Scanner;
//	define a class
public class HW8{
	//main method required
  public static void main(String []arg){
  	//declares input as a char
	char input;
	//declares instance of scanner object
	Scanner scan=new Scanner(System.in);
	//instructs user via printing out question, to enter C or c
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	//defines input for first method
	input=getInput(scan,"Cc");
	//once input is returned, prints out what you entered
	System.out.println("You entered '"+input+"'");
	//then asks user to enter v Y n or N , by printing the question
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	//declares input for second method
	input=getInput(scan,"yYnN",5); 
	//declares counter as an int = to 5
	int counter=5;
	//if statement saying if what is returned to the input is not equal to '', to print out input
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	//declares input for third method
	input=getInput(scan,"Choose a digit.","0123456789");
	//prints out input, which is returned
	System.out.println("You entered '"+input+"'");
  }  

	//first method
	public static char getInput(Scanner scan, String string) {
	
			//while loop to ensure that it keeps asking
	 		while(true) {
	 			//declares One as the user input
			String One=scan.next();
			//checks the length
			int length=One.length();
			//if statement ensuring that length = to 1
			if(length == 1) {
		
		//if statement checking to see if input is = to any of the acceptable values
		if(One.charAt(0) == string.charAt(0) || One.charAt(0) == string.charAt(1)) {
			//returns the user input, if true	
	   return One.charAt(0);
	    
	}else{
		//else it prints out that they did not enter a acceptable value
	   System.out.print("You did not enter a character from the list, try again! ");
	   
	   //because it's while(true), it keeps running until they get it right
}
}else{
	//prints that they did not enter only 1 character
	System.out.println("You should enter exactly one character. Step 1: Go back to the directions and reread. Step 2: Comprehend what you just read. Step 3: Enter one character only");
}

	}
	
}



//second method
public static char getInput(Scanner scan, String string, int counter) {
	//declares x as an int
	int x;
	//declares boolean as true
	boolean booooooooooooooooooool = true;
	//declares char retChar as having only a space (' ')
	char retChar = ' ' ;
	//for loop to limit tries to 5
	for(x=0; x<counter; x++) {
		//keeps boolean as true, until counter is too high
		booooooooooooooooooool= true;
		//while loop which runs if boolean equals true
		while(booooooooooooooooooool) {
			//declares Two as being user input
			String Two=scan.next();
			
			//declares length as length of user input or Two			
			int length=Two.length();
			//if statement ensuring length equals 1
			if(length == 1) {
			
		//if statement checking for user input as being acceptable value	
		if(Two.charAt(0) == string.charAt(0) || Two.charAt(0) == string.charAt(1) || Two.charAt(0) == string.charAt(2) || Two.charAt(0) == string.charAt(3)) {
	   //returns Two, if true (user input)
	   return Two.charAt(0);
	   
	//else it prints out error, and sets boolean to false, which stops the while loop    
	}else{
	   System.out.println("You did not enter a character from the list, try again! ");
	   booooooooooooooooooool = false;
	   
	   
}
//else statement printing out error for having more than 1 char
}else{
	System.out.println("You should enter exactly one character. Step 1: Go back to the directions and reread. Step 2: Comprehend what you just read. Step 3: Enter one character only");

}

	}
	//if statement printing error statement, if x = 4, it prints, which means they used all 5 tries
	if(x==4) {
		System.out.println("You failed after 5 tries. ");
	}
	}
	//returns retChar, which is the space, so it doesn't print what they entered
	return retChar;
}


//third method
public static char getInput(Scanner scan, String string, String numbers) {
		//while loop which is always true, so it continuously runs until user inputs correct/ acceptable value
		while(true) {
			//prints out string, which is the choose a digits string
		System.out.println(string);
		//prints out asking user ti input digit betwee n0 and 9
		System.out.println("Enter One of these mighty fine integers: '0','1','2','3','4','5','6','7','8','9' ");

			//declares string as user input
			String One=scan.next();
			//declares computation of length of user input
			int length=One.length();
			
			//if statement ensuring length is equal to 1
			if(length == 1) {
				
		// if statement verifying that user inputted an acceptable value
		if(One.charAt(0) == numbers.charAt(0) || One.charAt(0) == numbers.charAt(1) ||  One.charAt(0) == numbers.charAt(2) || One.charAt(0) == numbers.charAt(3) || One.charAt(0) == numbers.charAt(4) || One.charAt(0) == numbers.charAt(5) || One.charAt(0) == numbers.charAt(6) || One.charAt(0) == numbers.charAt(7) || One.charAt(0) == numbers.charAt(8) || One.charAt(0) == numbers.charAt(9)) {
			
			// if true, user input is returned
	   return One.charAt(0);
	 // else error statement is printed
	}else{
	   System.out.print("Are you blind? You did not enter an acceptable character ");
	   
}
//else error statement regarding number of characters inputted, is printed
}else{
	System.out.println("You should enter exactly one character. Step 1: Go back to the directions and reread. Step 2: Comprehend what you just read. Step 3: Enter one character only");
}

	}
	
}
}


