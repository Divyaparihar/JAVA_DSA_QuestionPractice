package methodsPractice;

import java.util.Scanner;

public class DoubleAll {
	
	public static int sum(int one, int two, int three, int four, int five) {
		int x = 2 * (one + two + three + four + five);
		return x;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		int four = sc.nextInt();
		int five = sc.nextInt();
		
		int result = DoubleAll.sum(one, two, three, four, five);
        System.out.println(result);
	}

}
