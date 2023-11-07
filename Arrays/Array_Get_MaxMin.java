package Arrays;

import java.util.Scanner;

public class Array_Get_MaxMin {
	 static void getMinMax(long a[], long n)  
	    {
	      
	    }
	    
	   public static void main(String[] args) {
	       
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("N");
	       int n = sc.nextInt();
	       
	      int arr[] = new int[n];
	      
	      // for input
	      for(int i=0; i<n; i++) {
	    	  arr[i] = sc.nextInt();
	      }
	      
	      // for output
	      for(int i=0; i<n; i++) {
	    	   System.out.println(arr[i]);
	       }
	       
	   }
	}
