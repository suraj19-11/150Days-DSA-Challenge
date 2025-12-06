public class PracticeProblem {
//Question 1 : Print the number of 7's that are in the 2d array.
// Example :
// Input - intlI array = { {4,7,8},{8,8,7} };
// Output - 2
public static void countno(int matrix[][], int key){
    int count = 0;
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] == key){
                count++;
            }
        }
    }
    System.out.println("Count of "+ key + " is " + count);
}

// Question 2 : Print out the sum of the numbers in the second row of the "nums" array.
// Example :
// Input - intlI nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18
public static void SumOfRow(int matrix[][]){
    int row = 1;
    int sum = 0;
    for(int j=0; j<matrix[row].length; j++){
        sum += matrix[row][j];
    }
    System.out.println("Sum = " + sum);
}

//Question 3 : Write a program to Find Transpose of a Matrix.
public static void TranposeMatrix(int matrix[][]){
    int rows = matrix.length;
    int cols = matrix[0].length;
    int TransposeMatrix[][] = new int[cols][rows];
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            TransposeMatrix[j][i] = matrix[i][j];
        }
    }

    //print TM
     for(int i=0; i<cols; i++){
        for(int j=0; j<rows; j++){
           System.out.print( TransposeMatrix[i][j] + " ");
        }
        System.out.println();
    }

}
public static void main(String[] args) {
    int matrix[][] = { {4,7,8},{8,8,7}};
    countno(matrix, 7);
    SumOfRow(matrix);
    TranposeMatrix(matrix);
}
}
