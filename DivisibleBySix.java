package BasicPractice;

import java.util.Scanner;

public class DivisibleBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        
        int lastDigit = Math.abs(number % 10);

       
        if (lastDigit % 6 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

