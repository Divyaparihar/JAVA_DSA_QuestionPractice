package Pattern;

import java.util.Scanner;

public class SolidRhombus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		
		System.out.println("Required Pattern: " + "\n");
		
		
		for(int i=1; i<=n; i++) {
			
			// Spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			// Stars
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
