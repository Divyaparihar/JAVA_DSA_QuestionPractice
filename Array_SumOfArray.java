package Arrays;

import java.util.Scanner;

public class Array_SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        int[] array = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(array[i] % 2 == 1) {
            	sum += array[i];
            }
        	
        }

       
        System.out.println("Sum :" + sum);

    }
}

