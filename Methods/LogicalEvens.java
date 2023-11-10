package methodsPractice;

import java.util.Scanner;

public class LogicalEvens {
	
	public static boolean checkIfBothEven(int value1, int value2) {
		return (value1 % 2 == 0) && (value2 % 2 == 0);
	}


	public static void main(String[] args) {
		 {
			Scanner sc = new Scanner(System.in);
			int one = sc.nextInt();
			int two = sc.nextInt();
			
			System.out.println(LogicalEvens.checkIfBothEven(one, two));

	}

}
}
