package BasicPractice;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		int r, s=0, temp;
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		n= sc.nextInt();
		
		temp=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(temp==s)
			System.out.println("Palindrome number");
		else
			System.out.println("not palindrome");

	}

}
