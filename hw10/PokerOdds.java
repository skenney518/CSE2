////////////////////////////
//Shaun Kenney
//11/17/2014
//cse02
//
// program randomizes a hand of poker
//      groups the cards into suite
// then generates 1000 hands
//      counts the number of times a hand with a specific pair
//      of rank occurs
//  also counts number of times w/o a pair
//
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    // calls method showHands
    simulateOdds();
    // calls method simutaleOdds
  }


public static void showHands() {
    //method showHands
Random number= new Random();
// initializes equation for random number
Scanner myScanner= new Scanner(System.in);
// initializes scanner
String clubs="Clubs: ";
// initializes clubs as being: Clubs: 
String diamonds="Diamonds: ";
// same thing for diamonds
String hearts="Hearts: ";
// ... aaand hearts
String spades="Spades: ";
// see the pattern here?
boolean checker=true;
// creates boolean bool with value true
int cardName=0;
// creates int cardName with value 0
int counter=0;
// counter with value 0
int deck[]= new int[52];
// array with dimension: 52
int hand[]=new int[5];
// array with dimension: 5
int swap=51;
// int swap with value 51
for(int x=0;x<52;x++) {
    // for statement which assigns values to array: deck
    deck[x]=x;
}
for(int y=0;y<5;y++) {
    // for statement which assigns values to array: hand
    hand[y]=-1;
}
        for(counter=0; counter<5; counter++) {
            // for statement which assigns value to index in array hand: and takes away a card from deck
            cardName=number.nextInt(swap);
            hand[counter]=deck[cardName];
            deck[cardName]=deck[swap];
            deck[swap]=-1;
            swap--;
    } 
    
    do{
        // do statement so it runs first, before asking
    for (int z = 0; z < 5; z++){
        //for statement to drawl 5 cards
        
        switch(hand[z] / 13) {
            // switch statement for value divided by 13, has all case statements to decide the suite
            // then within each suite, it checks for the actual value/ rank
            case 0:
                switch(hand[z] % 13) {
                    case 0:
                        clubs+="A ";
                        break;
                    case 1:
                        clubs+="K ";
                        break;
                    case 2:
                        clubs+="Q ";
                        break;
                    case 3:
                        clubs+="J ";
                        break;
                    case 4:
                        clubs+="10 ";
                        break;
                    case 5:
                        clubs+="9 ";
                        break;
                    case 6:
                        clubs+="8 ";
                        break;
                    case 7:
                        clubs+="7 ";
                        break;
                    case 8:
                        clubs+="6 ";
                        break;
                    case 9:
                        clubs+="5 ";
                        break;
                    case 10:
                        clubs+="4 ";
                        break;
                    case 11:
                        clubs+="3 ";
                        break;
                    case 12:
                        clubs+="2 ";
                        break;
                }
                break;
                        
                case 1:
                    
                switch(hand[z] % 13) {
                    case 0:
                        diamonds+="A ";
                        break;
                    case 1:
                        diamonds+="K ";
                        break;
                    case 2:
                        diamonds+="Q ";
                        break;
                    case 3:
                        diamonds+="J ";
                        break;
                    case 4:
                        diamonds+="10 ";
                        break;
                    case 5:
                        diamonds+="9 ";
                        break;
                    case 6:
                        diamonds+="8 ";
                        break;
                    case 7:
                        diamonds+="7 ";
                        break;
                    case 8:
                        diamonds+="6 ";
                        break;
                    case 9:
                        diamonds+="5 ";
                        break;
                    case 10:
                        diamonds+="4 ";
                        break;
                    case 11:
                        diamonds+="3 ";
                        break;
                    case 12:
                        diamonds+="2 ";
                        break;
                }
                break;
                
                case 2:
                    
                    switch(hand[z] % 13) {
                    case 0:
                        hearts+="A ";
                        break;
                    case 1:
                        hearts+="K ";
                        break;
                    case 2:
                        hearts+="Q ";
                        break;
                    case 3:
                        hearts+="J ";
                        break;
                    case 4:
                        hearts+="10 ";
                        break;
                    case 5:
                        hearts+="9 ";
                        break;
                    case 6:
                        hearts+="8 ";
                        break;
                    case 7:
                        hearts+="7 ";
                        break;
                    case 8:
                        hearts+="6 ";
                        break;
                    case 9:
                        hearts+="5 ";
                        break;
                    case 10:
                        hearts+="4 ";
                        break;
                    case 11:
                        hearts+="3 ";
                        break;
                    case 12:
                        hearts+="2 ";
                        break;
                }
                break;
                
                case 3:
                    switch(hand[z] % 13) {
                    case 0:
                        spades+="A ";
                        break;
                    case 1:
                        spades+="K ";
                        break;
                    case 2:
                        spades+="Q ";
                        break;
                    case 3:
                        spades+="J ";
                        break;
                    case 4:
                        spades+="10 ";
                        break;
                    case 5:
                        spades+="9 ";
                        break;
                    case 6:
                        spades+="8 ";
                        break;
                    case 7:
                        spades+="7 ";
                        break;
                    case 8:
                        spades+="6 ";
                        break;
                    case 9:
                        spades+="5 ";
                        break;
                    case 10:
                        spades+="4 ";
                        break;
                    case 11:
                        spades+="3 ";
                        break;
                    case 12:
                        spades+="2 ";
                        break;
        }
        break;
        }

        }
    
    

        System.out.println(clubs);
        System.out.println(diamonds);
        System.out.println(hearts);
        System.out.println(spades);
        // prints out a line for each suite, along with which cards were drawn
        
        System.out.print("Go again? Enter 'Y' or 'y', anything else to quit- ");
        // asks if they want to drawl again
        String answer;
        answer= myScanner.next();
        // assigns what they say, to answer
        
        if((answer.equals("y")) || (answer.equals("Y"))) {
            // if statement for checking if they say yes or no
            checker= true;
            // if yes, bool goes to true
          
        }else{
            // if not, bool goes to false, so it won't run again
            checker=false;
        }
        
        }while(checker); 
            
      
    }
    
    public static void simulateOdds(){
        //the fuck did he even want us to do?
    }
}   
