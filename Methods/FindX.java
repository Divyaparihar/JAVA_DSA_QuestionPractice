package methodsPractice;

import java.util.Scanner;

public class FindX {

    public static int calculateResult(int x) {
        return (3 * x) + 10;
    }

    public static boolean isInputValid(int x) {
        return x > 0 && x < 1000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
        int x = sc.nextInt();

        if (isInputValid(x)) {
            int result = calculateResult(x);
            System.out.println(result);
        } else {
            System.out.println("Invalid input. Please enter a value within the range 0 < x < 1000.");
        }
    }
}
