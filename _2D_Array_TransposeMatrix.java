package Assignment5_Matrix;

import java.util.Scanner;

public class _2D_Array_TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        int n = scanner.nextInt(); // Number of rows
        int m = scanner.nextInt(); // Number of columns

        int[][] matrix = new int[n][m];

        // Input the elements of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpose the matrix and print the result
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
