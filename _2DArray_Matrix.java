package Assignment5_Matrix;

import java.util.Scanner;

public class _2DArray_Matrix {
	public static void main(String[] args) {

		 
		Scanner sc = new Scanner(System.in) ;
	       int raw  = sc.nextInt();
	       int col  = sc.nextInt();
	       
	     int[][] matrix = new int[raw][col]; 
	      
	     //Input
	     for(int i = 0; i<raw ;i++) {
	    	 for ( int j=0; j<col ;j++) {
	    		 matrix[i][j]  = sc.nextInt();
	    	 }
	     }
	     
	     
	     // Output
	     for(int i = 0; i<raw ;i++) {
	    	for ( int j=0; j<col ;j++) {
	    		System.out.print( matrix[i][j] + " ");
	    	}
	    	System.out.println(); 
	     }
	}
	}     