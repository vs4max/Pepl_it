package Practice51_100;

public class Task082_2DArray {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program that will print the sum of all elements in 2D array. 

Expected Output:
-9
		 */
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			for(int b=0; b<a[i].length; b++) {
				 sum+=a[i][b];
			}
			
		}
		System.out.println(sum);
	}

}
