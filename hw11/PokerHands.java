//Shaun Kenney
//12/5/2014
//cse2
//hw11
//pokerhands
// 
//
//  has the user put together a poker hand comprised of 5 cards
//  The program than checks to see if you have any sets
//
//import scanner class
import java.util.Scanner;
//define a class
public class PokerHands{
    //main method required
    public static void main(String [] args){
        //declare instance of scanner object
        Scanner myScanner=new Scanner(System.in);
        //creates a 1D array, with 5 slots
        String [] choiceSuit= new String[5];
        //creates a 1D array with 5 slots
        String [] choiceCard= new String [5];
        //creates a string for hearts
        String suitHearts="Hearts: ";
        //creates a string for diamonds
        String suitDiamonds="Diamonds: ";
        //creates a string for clubs
        String suitClubs="Clubs: ";
        //creates a string for spades
        String suitSpades="Spades: ";
        
        //creates a boolean to trigger while
        Boolean userAnswer=true;
        //creates a string for users choice of suit
        String userChoice="";
        //creates a string for users choice of card
        String userChoiceTwo="";
        
        //always true unless user doesnt put in valid response        
        while(userAnswer) {
            //creates for loop, runs 5 times
            for(int counter=0; counter<5; counter++) {
                //boolean which stays true
            Boolean userAnswerThree=true;
            //while which stays true unless triggered
            while(userAnswerThree) {
                
            //prints out the questions
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's' ");
            //puts the input into string
            userChoice= myScanner.next();
                //if statement verifying
                if((userChoice.equals("c")) || (userChoice.equals("C")) || (userChoice.equals("D")) || (userChoice.equals("d")) || (userChoice.equals("S")) || (userChoice.equals("s")) || (userChoice.equals("H")) || (userChoice.equals("h"))) {
                    //if this triggers id eosnt replay the while
                    userAnswerThree=false;
                }else{
                    //says error statement
                    System.out.println("You did not enter a valid response ");
                    //stays true if false
                    userAnswerThree=true;
                }
            }
            //boolean which stays true unless user puts in error
            Boolean userAnswerTwo=true;
            //while loop, stays true until user puts in unacceptable input
            while(userAnswerTwo) {
            //prints out user questions
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2' ");
            //assigns user input to string
            userChoiceTwo= myScanner.next();
                //if statement seeing if answer is valid
                if((userChoiceTwo.equals("A")) || (userChoiceTwo.equals("a")) || (userChoiceTwo.equals("k")) || (userChoiceTwo.equals("K")) || (userChoiceTwo.equals("q")) || (userChoiceTwo.equals("Q")) || (userChoiceTwo.equals("j")) || (userChoiceTwo.equals("J")) || (userChoiceTwo.equals("2")) || (userChoiceTwo.equals("3")) || (userChoiceTwo.equals("4")) || (userChoiceTwo.equals("5")) || (userChoiceTwo.equals("6")) || (userChoiceTwo.equals("7")) || (userChoiceTwo.equals("8")) || (userChoiceTwo.equals("9"))) {
                    //turns false, to stop the while loop, if acceptable input
                    userAnswerTwo=false;
                }
                    //else statement
                    else{
                    //prints error statement
                    System.out.println("You did not enter a valid response ");
                    //loop keeps going if input isn't valid
                    userAnswerTwo=true;
                }
            }
            //assigns value of user input, into the counter-th slot in array
            choiceSuit[counter]=userChoice;
            //assigns value of second user input, into the counter-th slot in array
            choiceCard[counter]=userChoiceTwo;
            
            //all these create strings
            String letter="s";
            String letterTwo="S";
            String letterThree="D";
            String letterFour="d";
            String letterFive="H";
            String letterSix="h";
            String letterSeven="C";
            String letterEight="c";
            
            //if statements identifying which suit each card is
            if((choiceSuit[counter].equals(letterSeven)) || (choiceSuit[counter].equals(letterEight))) {
                suitClubs+= choiceCard[counter] + " ";
            }
            
            if((choiceSuit[counter].equals(letter)) || (choiceSuit[counter].equals(letterTwo))) {
                suitSpades+= choiceCard[counter] + " ";
            }
            
            if((choiceSuit[counter].equals(letterFive)) || (choiceSuit[counter].equals(letterSix))) {
                suitHearts+= choiceCard[counter] + " ";
            }
            
            if((choiceSuit[counter].equals(letterThree)) || (choiceSuit[counter].equals(letterFour))) {
                suitDiamonds+= choiceCard[counter] + " ";
            }
            
            }
            //prints all the suits, with the cards
            System.out.println("");
            System.out.println(suitHearts);
            System.out.println(suitDiamonds);
            System.out.println(suitClubs);
            System.out.println(suitSpades);
            
            //asks user if they want to go again!!
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand ");
            String userInput=myScanner.next();
            
            //identifies the response
            if((userInput.equals("Y")) || (userInput.equals("y")) || (userInput.equals("N")) || (userInput.equals("n"))) {
                }else{
                System.out.println("You did not enter a valid response ");
                return;
            }
            
            if(userInput.equals("Y") || userInput.equals("y")) {
                userAnswer=true;
            }else{
                userAnswer=false;
            }
    }
}
}