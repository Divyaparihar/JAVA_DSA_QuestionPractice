package Strings;

import java.util.Scanner;

public class String_PrintCharacterStringInReverse {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter any string: ");
	        String S = sc.next();
	   
	  
         char[] C = S.toCharArray();  
	         for(int i=C.length -1; i>=0; i--) {
	        	System.out.print(C[i]);    
	      }
	      System.out.println("");
	      
	}
}