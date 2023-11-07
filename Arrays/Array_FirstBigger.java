package Arrays;

import java.util.Scanner;

public class Array_FirstBigger {
	
	public static int isFirstBigger(int arr[],int k) {
		int n = arr.length;
		int target = k;
		
		for(int i =0; i<n; i++) {
			if (arr[i]>k) {
				target = arr[i];
			}
			
	//		if(arr[i]>k && arr[i] == target) {
			if(arr[i]>k) {
				target = arr[i];
			}
		}
		
		return target;
	}

	public static void main(String[] args) {
		
       int arr[] = {10, 45, 12, 65, 70, 9, 43};
       
       Scanner sc = new Scanner(System.in);
      
       int query = sc.nextInt();
       
       for(int i =0; i<query; i++) {
    	   int k = sc.nextInt();
    	   int ans = isFirstBigger(arr , k);
    	   
    	   System.out.println(ans);
       }
      
	}

}
