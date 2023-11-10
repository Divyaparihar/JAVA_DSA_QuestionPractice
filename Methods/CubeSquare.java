package methodsPractice;

import java.util.Scanner;

public class CubeSquare {
	
	public static void compare(int n, int m) {
		if((n * n * n) > (m * m * m)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
 
		CubeSquare.compare(n, m);
		
	}

}
