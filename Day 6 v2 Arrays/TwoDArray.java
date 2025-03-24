public class TwoDArray {
    static void diagonals_sum(int[][] input_matrix, int matrix_size) {
       int First_diagonal = 0, Second_diagonal = 0;
       for (int i = 0; i < matrix_size; i++) {
          for (int j = 0; j < matrix_size; j++) {
             if (i == j)
                First_diagonal += input_matrix[i][j];
             if ((i + j) == (matrix_size - 1))
                Second_diagonal += input_matrix[i][j];
          }
       }
       System.out.println("\n The sum of 1st diagonal elements of the matrix is: " + First_diagonal);
 
       System.out.println("\n The sum of 2nd diagonal elements of the matrix is: " + Second_diagonal);
    }
    static public void main(String[] args) {
       int[][] input_matrix = {
          { 1, 2, 3 },
          { 4, 5, 6 },
          {7, 8, 9  },
       };
       int matrix_size = 3;
       System.out.println("The matrix will be displayed as  : ");
       for (int i = 0; i < matrix_size; i++) {
          for (int j = 0; j < matrix_size; j++)
          System.out.print( input_matrix[i][j] + " ");
          System.out.print("\n");
       }
       diagonals_sum(input_matrix, matrix_size);
    }
 }
