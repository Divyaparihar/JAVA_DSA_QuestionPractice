package methodsPractice;

import java.util.Scanner;

public class TwoSumsOneNumber {
    
    public static int sum1(int One, int Two) {
        return One + Two;
    }

    public static int sum2(int Three, int Four) {
        return Three + Four;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number one: ");
        int One = sc.nextInt();

        System.out.println("Enter the number Two: ");
        int Two = sc.nextInt();

        System.out.println("Enter the number Three: ");
        int Three = sc.nextInt();

        System.out.println("Enter the number Four: ");
        int Four = sc.nextInt();

        System.out.println("Enter the number Five: ");
        int Five = sc.nextInt();

        int sum1Result = sum1(One, Two);
        int sum2Result = sum2(Three, Four);

        if ((sum1Result + sum2Result) > Five) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
