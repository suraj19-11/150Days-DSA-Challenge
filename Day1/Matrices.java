import java.util.*;

// 2D Array 

public class Matrices {

    public static boolean search(int matrix[][], int key){
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( matrix[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //For largest number among the matrices
    public static int Largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;

         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    //For Smallest number among the matrices
    public static int Smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;

         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m =matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
         for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }

        search(matrix, 5);
        System.out.println("Largest :" + Largest(matrix));
        System.out.println("Smallest :" + Smallest(matrix));
        sc.close();

    }
    
}
