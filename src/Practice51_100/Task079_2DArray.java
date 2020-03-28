package Practice51_100;

public class Task079_2DArray {

	public static void main(String[] args) {
		/*
		 * Write a program to print values from a 2D array

Example Output:
1.4 2.0 3.3 2.0 
4.0 1.5 6.1 1.0 
1.2 3.1 4.0 1.6 
		 */
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
		for(int num=0; num<a.length; num++) {
			for(int num1=0; num1<a[num].length; num1++) {
				System.out.print(a[num][num1]+" ");
			}
			System.out.println();
		}
		 
		
	}

}
