package methodsPractice;

import java.util.Scanner;

public class ApplyBrakes {
	
	public static int calculateSpeed(int distance, int time) {
		 if (distance >1000 || time > 5) {
		        System.out.println("Invalid input.");
		        return -1; 
		    }
		
		
		int speed = distance / time;
		if(speed > 40) {
			System.out.println("Apply Brake");
		}else {
			System.out.println("Keep Going");
		}
		return speed;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int distance = sc.nextInt();
		int time = sc.nextInt();
		
		ApplyBrakes.calculateSpeed(distance, time);
		

	}

}
