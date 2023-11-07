package Arrays;

public class Array_CountZeroOnesTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,2,0,1,2,0};
        int n = arr.length;
        
        int count0 = 0, count1 = 0, count2 = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }
        
        System.out.println("Count of 0's: " + count0);
        System.out.println("Count of 1's: " + count1);
        System.out.println("Count of 2's: " + count2);
    }
}
