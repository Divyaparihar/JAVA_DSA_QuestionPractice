package Loop;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
		
		int count = 0;

	    while (x != 0) {
	     
	      x /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	
	
	}


