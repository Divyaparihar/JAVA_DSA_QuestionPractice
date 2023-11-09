package Pattern;

public class TopBottom {

	 public static void main(String[] args) {
		 int n = 5;

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  "); // Print spaces
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* "); // Print stars
	            }
	            System.out.println();
	        }
	    }
	}