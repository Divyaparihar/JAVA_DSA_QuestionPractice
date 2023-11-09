package Pattern;

public class BottomUp {

	public static void main(String[] args) {
		int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int k = i; k <= n; k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
    }
}