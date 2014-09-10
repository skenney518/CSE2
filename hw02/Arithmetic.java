///////////////////////////////////////////
// Shaun Kenney
// 9/5/14
// 
//cse02
//hw02
//Arithmetic
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic
//
//  the program prints the total cost of each kind of item
//  the program prints the total cost of purchase
//  the program prints the total cost including tax
//
//  define class
public class Arithmetic {
    // main method
    public static void main (String[] args) {
// our input data
    int nSocks=3; // number of pairs of socks
    double sockCost$=2.58; // cost of a pair of socks
    int nGlasses=6; // number of drinking glasses
    double glassCost$=2.29; // cost of drinking glasses
    int nEnvelopes=1; // number of envelopes
    double envelopeCost$=3.25; // cost of envelopes
    double taxPercent=0.06; // PA tax rate

// creates the variables
    double totalSockCost$, totalSockTax$, totalGlassCost$, totalGlassTax$; 
    double totalEnvelopeCost$, totalEnvelopeTax$, totalCost$, totalTax$; 
    double totalSockCostTax$, totalGlassCostTax$, totalEnvelopeCostTax$, Total$;
   
// computes the numerical values of the variables, by creating specific equations
    totalSockCost$=(nSocks*sockCost$);
    totalSockTax$=(totalSockCost$*taxPercent);
    totalSockCostTax$=(totalSockCost$+totalSockTax$);
    totalGlassCost$=(nGlasses*glassCost$);
    totalGlassTax$=(totalGlassCost$*taxPercent);
    totalGlassCostTax$=(totalGlassCost$+totalGlassTax$);
    totalEnvelopeCost$=(nEnvelopes*envelopeCost$);
    totalEnvelopeTax$=(totalEnvelopeCost$*taxPercent);
    totalEnvelopeCostTax$=(totalEnvelopeCost$+totalEnvelopeTax$);
    totalCost$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$);
    totalTax$=(totalCost$*taxPercent);
    Total$=(totalCost$+totalTax$);
    
// type cast the doubles into integers, to limit to two digits after decimal point
    totalSockCostTax$=(int)(totalSockCostTax$*100) / 100.0;
    totalGlassCostTax$=(int)(totalGlassCostTax$*100) / 100.0;
    totalEnvelopeCostTax$=(int)(totalEnvelopeCostTax$*100) / 100.0;
    totalCost$=(int)(totalCost$*100) / 100.0;
    Total$=(int)(Total$*100) / 100.0;
    
// print out the numerical values
    System.out.println("Total cost of the 3 pairs of socks is "+(totalSockCostTax$)+" dollars.");
    System.out.println("Total cost of the 6 drinking glasses is "+(totalGlassCostTax$)+" dollars.");
    System.out.println("Total cost of the 1 pack of envelops is "+(totalEnvelopeCostTax$)+" dollars.");
    System.out.println("Total cost excluding tax is "+(totalCost$)+" dollars.");
    System.out.println("The total cost including tax is "+(Total$)+" dollars.");
    }
}

    
    
    
    