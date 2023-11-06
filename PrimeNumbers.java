package assignment_2;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 50; // Change this value to adjust the range

        System.out.println("Prime Numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}