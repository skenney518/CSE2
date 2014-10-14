///////////////////////////////////////////////
//Shaun Kenney
//
//cse02
//hw06
//Roulette
//
//  program has a person randomly select a number
//      the person then bets on that number 100 times
//  program has a random spinner assign the spinner's result
//      if numbers match up the man is given 35 dollars (as he does not lose a dollar)
//  if numbers dont match up, man pays a dollar
//      after 100 of these spins, (loops), the amount of money the man walks away with is tallied
//  now we want to redo this scenario 1000 times
//      in the end we want to calculate what he walks away with (after 1000 times))
//  and how many times he lost everything
//      and how many times he came out with a profit
//
//

// define a class
public class Roulette {
    //main method required
    public static void main(String arg[]) {
        
        //defines tickertwo as 0
        int TickerTwo=0;
        //defines ticker as 0
        int Ticker=0;
        //defines the random number the man bets on        
        int randomNumber=(int)(Math.random()*38);
        //defines his pot of money starting at $100
        int moneyPot=100;
        //defines his total profit to begin at 0
        int totalProfit=0;
        //defines the number of times he walks away with nothing, at 0
        int loseEverything=0;
        //defines the number of times he walks away with a profit, as 0
        int luckyPerson=0;
        
        // creates while loop where as long as tickertwo is less than 1000, it keeps going    
       while(TickerTwo<1000) {
           //initializes moneyPot as beginning with 100
           //this placement is necesary as everytime it enters loop. moneyPot starts at 100 everytime
           moneyPot=100;
            //inner while loop
            //ticker is less than 100, keep going
            while(Ticker<100) {
            
            //random number which represents what is spun
            int randomNumberTwo=(int)(Math.random()*38);
            
            //if statement where it compares the relations between both random numbers
            if (randomNumberTwo == randomNumber) {
                //if numbers are same, man is awarded 35$
                moneyPot+=35;
            
                
            }else{
                //if not, man loses 1 dollar
                moneyPot-=1;
                
            }
            //adds 1 to ticker
            Ticker++;
            
        }
            
            //resets ticker to 0, everytime it exits inner loop
            Ticker=0;
                // if at the end of 100 spins, moneyPot equals zero, it adds to the count of 
                //how many times he lost everything
             if(moneyPot==0) {
                 loseEverything+=1;
                 
                
             }else{
                   
             //if at the end of 100 spins, man walks away with over 100 dollars,
             //adds to the count of how many times he profits
             //also adds those winnings to the total tally of winnings
             if(moneyPot>100) {
                 luckyPerson+=1;
                 totalProfit+=moneyPot;
                 
             }else{
                 // if at the end of 100 spins, the amount he walks away with does not fall into either of those 
                 //categories, winnings are still added to total tally
                 totalProfit+=moneyPot;
             }
             }
                  
                    
            //adds 1 to tickertwo  
            TickerTwo++;
    
    
            
        }
        
        //prints entire statement
        System.out.println("You lost everything "+loseEverything+" times. You come out with a profit "+luckyPerson+" times. Your total winnings equal $"+totalProfit+". ");
    }
}
