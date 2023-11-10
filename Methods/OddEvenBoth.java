package methodsPractice;

import java.util.Scanner;

public class OddEvenBoth {
	
	public static void checkIfBothEven(int value1, int value2) {
		if(value1 % 2 == 0 && value2 % 2 == 0) {
			System.out.println("Even");
		}else if(value1 % 2 != 0 && value2 % 2 != 0) {
			System.out.println("Odd");
		}else {
			System.out.println("Even-odd");
		}
			
	}

	public static void main(String[] args) {
		 {
			Scanner sc = new Scanner(System.in);
			int one = sc.nextInt();
			int two = sc.nextInt();
			
			checkIfBothEven(one, two);	

	}

}
}