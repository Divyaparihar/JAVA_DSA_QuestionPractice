package Arrays;

public class Array_InputTaking {

	public static void main(String[] args) {
		
	       
	       int raw  =   3  ; 
	    		   
		     int col = 4 ;
		     
		     int[][] arr  = new int [raw][col] ;
		     
		     
		     for(int i=0; i<arr.length ; i++) {
		    	 String rw  = "";
		    	 for(int j=0; j<arr[0].length; j++) {
		    		 
		    		rw = rw +arr[i][j] +" ";
		    		
		    	 }
		    	 System.out.println(rw);
		     }
		     
		     
		     int num = 31 ;
		     for(int i=0; i<arr.length ; i++) {
		
		    	 for(int j=0; j<arr[0].length; j++) {
		    		 
		    		 arr[i][j] = num ;
		    		 num++ ;
		    		
		    	 }
		    	
		     }
		     
		     for(int i=0; i<arr.length ; i++) {
		    	 String rw  = "";
		    	 for(int j=0; j<arr[0].length; j++) {
		    		 
		    		rw = rw +arr[i][j] +" ";
		    		
		    	 }
		    	 System.out.println(rw);
		     }
		     
	}

		     
}

