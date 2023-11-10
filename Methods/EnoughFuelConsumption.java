package methodsPractice;

import java.util.Scanner;

public class EnoughFuelConsumption {

    public static int calculateRequiredFuel(int fuel, int distance) {
        return fuel * distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fuel = sc.nextInt();
        int distance = sc.nextInt();

        int required = calculateRequiredFuel(fuel, distance);

        if (required > 50) {
            System.out.println("Enough");
        } else {
            System.out.println("Go On");
        }
    }
}
