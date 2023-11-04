package Assignment5_Matrix;

import java.util.Scanner;

//Input
//• The first line of the input contains N and m , the dimensions of the matrix
//• The next N line contains M space separated integers, denoting the elements of the matrix
//  Output
//• Print the elements of the matrix, row by row, by adding 1 to each element


public class _2D_Array_Add1InMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the rectangular matrix
        int n = scanner.nextInt(); // Number of rows
        int m = scanner.nextInt(); // Number of columns

        int[][] matrix = new int[n][m];

        // Input the elements of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Increment each element of the matrix by 1 and print the updated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] += 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
