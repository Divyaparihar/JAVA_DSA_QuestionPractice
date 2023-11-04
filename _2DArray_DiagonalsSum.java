package Assignment5_Matrix;

import java.util.Scanner;

public class _2DArray_DiagonalsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int raw = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[raw][col];

        System.out.println("Enter elements:");
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements:");
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
      
            
            System.out.println();
        }

        int sumLeft = 0, sumRight = 0;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j)
                    sumLeft += matrix[i][j];

                if (i + j == col - 1)
                    sumRight += matrix[i][j];
            }
        }

        System.out.println("Sum of Left diagonal: " + sumLeft);
        System.out.println("Sum of Right diagonal: " + sumRight);
    }
}
