package Arrays;

import java.util.Scanner;

public class Array_ReverseArrayTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input the elements of the array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the reverse traversal of the array
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
