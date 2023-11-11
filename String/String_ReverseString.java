package Strings;

import java.util.Scanner;

public class String_ReverseString {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter any string: ");
	        String S = sc.next();
	        System.out.println("Length of the string: " +  S.length());
	        
	   //  Approach-2
	      for(int i=S.length()-1; i>=0; i--) {
	    	     System.out.print(S.charAt(i));
	      } 
	      System.out.println("");
	  
	    // Approach-3
	      StringBuffer sb = new StringBuffer(S);
	      System.out.print(sb.reverse());
	      
	      System.out.println("");
	      
	   // Approach-4
	      StringBuilder sbuilder = new StringBuilder(S);
	      System.out.print(sbuilder.reverse());
	      
	      System.out.println("");
	}

}
