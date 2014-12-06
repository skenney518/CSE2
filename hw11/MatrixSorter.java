// Ziyi Kenney
//cse02
//December 5th, 2014
//hw11
//
//  creates 3D arrays (slabs) comprised of random ints
//      then sorts out the minimum
//  then, sorts from inimum to maximum, assigning order from tirst int in row
//

//define a class
public class MatrixSorter{
    //main method required
  public static void main(String arg[]){
    //creates 3D array
    int mat3d[][][];
    //assigns value of method to int 3D array
    mat3d=buildMat3d();
    //calls method
    show(mat3d);
    //print statement for smallest entry
    System.out.println("The smallest entry in the 3D matrix is "+
              findMin(mat3d));
   System.out.println();
   //prints out statement for sorted matrix
   System.out.println("After sorting the 3rd matrix we get");
    //calls method
    sort(mat3d[2]);
    //calls method
    show(mat3d);
   }
    //new method for randomizing the slabs
    public static int [][][] buildMat3d() {
        //defines array to be 3 X 7X 9 dimensioned
        int mat3d [][][]= new int [3][7][9];
        //for loop which runs 3 times
        for(int s=0; s<3; s++) {
            //for loop which runs a different amount of times
            for(int j=0; j<(3+2*s); j++) {
                //for loop which does the same
                for(int c=0; c<(s+j+1); c++) {
                    //defines values based on raondom generation
                    mat3d[s][j][c]= (int)(Math.random()*99);
                    
                }
            }
        }
        //returns the resulting array
        return mat3d;
    }
    
    //new method, for printing the array
    public static void show(int mat3d[][][]) {
        //for loop which runs 3 times again
        for(int s=0; s<3; s++) {
            //this for loop does the same as the first method
            for(int j=0; j<(3+2*s); j++) {
                //for follows pattern of array ^^
                for(int c=0; c<(s+j+1); c++) {
                    //prints of the array slot for s,j,c
                    System.out.print(mat3d[s][j][c]);
                    //prints out a blank space to seperate
                    System.out.print(" ");
            }
            //prints out blank line to seperate 
             System.out.println();
            }
            
            System.out.println();
        }
    }
    
    //mew method to find minimum
    public static int findMin(int mat3d[][][]) {
        //creates int to check for minimum, valued at 100 because it's gaurenteed to be larger than any int in array
        int checker=100;
        //for loop, runs 3 times, get the pattern?
        for(int s=0; s<3; s++) {
            //holy shit, it' sthe same pattern as ^^
            for(int j=0; j<(3+2*s); j++) {
                //Have you caught on?
                for(int c=0; c<(s+j+1); c++) {
                    //if statement which replaces checkder value, as the slot in array, if it's lower
                    if(checker> mat3d[s][j][c]){
                        checker=mat3d[s][j][c];
                    }
                }
            }
        }
        //returns this int value
        return checker;
        
                    
    }
 
    //Can you translate the directions? Because Google Translate was unable to.
    public static void sort(int mat3d[][]) {
       
    }
            
            
    
    

}
