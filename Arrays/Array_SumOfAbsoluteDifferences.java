package Arrays;



public class Array_SumOfAbsoluteDifferences {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5, 7, 12}; 

        int sumOfAbsoluteDifferences = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int absoluteDifference = Math.abs(A[i] - A[j]);
                int distance = j - i;
                if (isPrime(distance)) {
                    sumOfAbsoluteDifferences += absoluteDifference;
                }
            }
        }

        System.out.println("Sum of absolute differences for prime distances: " + sumOfAbsoluteDifferences);
    }
}

