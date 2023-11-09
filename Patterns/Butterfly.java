package Pattern;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		
		System.out.println("Required Pattern: " + "\n");
		
		// Upper Half
		for(int i=1; i<=n; i++) {
			
			// 1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			// spaces
			int spaces = 2 * (n-i);
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			// 2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Lower Part
		
         for(int i=n; i>=1; i--) {
			
			// 1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			// spaces
			int spaces = 2 * (n-i);
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			// 2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}         
		
		
		
	}

}
