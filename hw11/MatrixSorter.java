// Ziyi Kenney
//cse02
//December 5th, 2014
//hw11

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
              findMin(mat3d));
   System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }

    public static int [][][] buildMat3d() {
        int mat3d [][][]= new int [3][7][9];
        for(int s=0; s<3; s++) {
            for(int j=0; j<(3+2*s); j++) {
                for(int c=0; c<(s+j+1); c++) {
                    mat3d[s][j][c]= (int)(Math.random()*99);
                    
                }
            }
        }
        return mat3d;
    }
    
    public static void show(int mat3d[][][]) {
        for(int s=0; s<3; s++) {
            for(int j=0; j<(3+2*s); j++) {
                for(int c=0; c<(s+j+1); c++) {
                    System.out.print(mat3d[s][j][c]);
                    System.out.print(" ");
            }
             System.out.println();
            }
            System.out.println();
        }
    
    }
    
    public static int findMin(int mat3d[][][]) {
        int checker=100;
        for(int s=0; s<3; s++) {
            for(int j=0; j<(3+2*s); j++) {
                for(int c=0; c<(s+j+1); c++) {
                    if(checker> mat3d[s][j][c]){
                        checker=mat3d[s][j][c];
                    }
                }
            }
        }
        
        return checker;
                    
    }
    
    public static void sort(int mat3d[][]) {
       
    }
            
            
    
    

}
