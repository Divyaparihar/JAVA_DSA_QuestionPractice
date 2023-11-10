package methodsPractice;

import java.util.Scanner;

public class CompareSevenNumbers {
	
	public static void compare(int sum1, int sum2) {
		if(sum1 > sum2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		
		int sum1 = (a + b) * c;
		int sum2 = (d + e + f +g);
		
		CompareSevenNumbers.compare(sum1, sum2);

	}

}
