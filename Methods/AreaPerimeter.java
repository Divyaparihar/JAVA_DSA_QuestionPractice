package methodsPractice;

import java.util.Scanner;

public class AreaPerimeter {
	
	public static void calculateArea(int L1, int B1, int L2, int B2) {
		int Area1 = (L1 * B1);
		int Area2 = (L2 * B2);
		if(Area1 > Area2) {
			System.out.println("Area of rectangle 1 > Area of rectangle 2");
		}else {
			System.out.println("false");
		}
		
	}
	
	public static void calculatePerimeter(int L1, int B1, int L2, int B2) {
		int Perimeter1 = 2 *(L1 + B1);
		int Perimeter2 = 2 *(L2 + B2);
		if(Perimeter1 > Perimeter2) {
			System.out.println("Perimeter of rectangle 1 > Perimeter of rectangle 2");
		}else {
			System.out.println("false");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L1 = sc.nextInt();
		int B1 = sc.nextInt();
		int L2 = sc.nextInt();
		int B2 = sc.nextInt();

		AreaPerimeter.calculateArea(L1, B1, L2, B2);
	    AreaPerimeter.calculatePerimeter(L1, B1, L2, B2);
		
	}

}
