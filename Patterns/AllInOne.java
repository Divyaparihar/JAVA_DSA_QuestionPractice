package Pattern;

public class AllInOne {

	public static void main(String[] args) {
		
		System.out.println("Pattern 1");
		pattern1(5);
		
		System.out.println();
		
		System.out.println("Pattern 2");
		pattern2(5);

	}
	
	static void pattern1(int n) {
		for(int row =1; row <= n; row++) {                //   *
			for(int col =1; col <= row; col++) {          //   * *
				System.out.print("* ");                   //   * * *
			}
			
			System.out.println();
		}
	}
	
	static void pattern2(int n) {                        //   ******
		for(int row =1; row <= n; row++) {               //   ******
			for(int col =1; col <= n; col++) {           //   ******  
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
