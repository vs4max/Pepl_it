package Practice51_100;

public class Task081_2DArray {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program that prints the highest value in the array.

Expected Output:
8
		 */

		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		int max = a[0][0];
	for(int i=0; i<a.length; i++) {
		for(int b=0; b<a[i].length; b++) {
			 if(max<a[i][b])
			        max = a[i][b];
		}
		
	}
	System.out.println(max);
	}

}
