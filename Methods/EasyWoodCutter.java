package methodsPractice;

import java.util.Scanner;

public class EasyWoodCutter {
	
	public static void calculate(int N) {
		
	 if(N % 3 == 0 && N < 1000) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		EasyWoodCutter.calculate(N);

	}

}
