package methodsPractice;

import java.util.Scanner;

public class CompareTwoNumbers {
	
	public static void compare(int one, int two) {
		if(one > two) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		CompareTwoNumbers.compare(one, two);

	}

}
