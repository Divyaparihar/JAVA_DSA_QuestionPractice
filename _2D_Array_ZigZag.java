package Assignment5_Matrix;

public class _2D_Array_ZigZag {

	public static void main(String[] args) {

		int[][] mat = {{1,2,3,4,5}, {6,7,8,9,1}, {3,2,5,4,6}, {7,8,9,1,2}};
	    
		int n = mat.length;
		int m = mat[0].length;
		
		ZigzagTraverse(mat, n, m);
	}
	
	public static void ZigzagTraverse(int[][] mat, int n, int m) {
		
		for(int i = 0; i<n; i++) 
		{
			if(i%2==0) 
			{
				for(int j=0; j<m; j++)
				{
					System.out.print(mat[i][j] + " ");
				}
			}else {
				for(int j=m-1; j>=0; j--) 
				{
					System.out.print(mat[i][j] + " ");
				}
			}
			
			System.out.println();
		}

	}

}
