package Arrays;

import java.util.Scanner;

public class Array_FindX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       
	       System.out.println("N");
	       int n = sc.nextInt();
	       
	      int arr[] = new int[n];
	      
	      // for input
	      for(int i=0; i<n; i++) {
	    	  arr[i] = sc.nextInt();
	      }
	      
	      System.out.println("Enter the value of x: ");
	      int x = sc.nextInt();
	      
	      // for output
	      for(int i=0; i<n; i++) {
	    	  if(arr[i] == x) {
	    	   System.out.println("x found at index :" + i);
	    	  }
	       }
	       
	   }
	}