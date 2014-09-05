/////////////////////////////////////////////////////
//Shaun Kenney
//9/5/2014
//
//cse02
//lab-02
//Cyclometer
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//
//
//  program prints the number of minutes for each trip
//  program prints the number of counts for each trip
//  program prints the distance of each trip in miles
//  program prints the distance of the two trips combined
//
// define a class
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
// our input data
        int secTrip1=480; // prints the number of seconds of Trip 1
        int secTrip2=3220; // prints the number of seconds of Trip 2
        int countsTrip1=1561; // prints the number of counts of Trip 1
        int countsTrip2=9037; // prints the number of counts of Trip 2
// our intermediate variables and output data
        double wheelDiameter=27.0; // constant for double wheel diamater
        double PI=3.14159; // constant for PI
        double feetPerMile=5280; // number of feet in a mile
        double inchesPerFoot=12; // number of inches in a foot
        double secondsPerMinute=60; // number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; // doubles the distances from Trip 1, Trip 2, and Total Distance
// prints out our stored numbers
        System.out.println("Trip 1 took "+
            (secTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
// run the calculations; store the values. Document your caluclations here.
// the program is calculating the values for the distances of the trips
        distanceTrip1=countsTrip1*wheelDiameter*PI;
    // Above gives distance in inches
    // (for each count, a rotation of the wheel travels
    // the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // Gives distance for Trip 2
        totalDistance=distanceTrip1+distanceTrip2;
// Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }   //end of main method
} //end of class
