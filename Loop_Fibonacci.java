package Loop;

public class Loop_Fibonacci {

	public static void main(String[] args) {
		
		int n = 10;
		int first = 0, second = 1;
		
		for (int i =1; i <=n; n++) {
			System.out.println(first + "");
			
			int next = first + second;
			first = second;
			second = next;
		}
	}
}
