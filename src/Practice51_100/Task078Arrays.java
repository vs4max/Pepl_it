package Practice51_100;

import java.util.Scanner;

public class Task078Arrays {

	public static void main(String[] args) {
		/*
		 * For you to do:

Create an int array of integers with a size of 5 and input values with Scanner. 
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below

Example:
Input:
1
2
3
4
5

Output:
10
20
30
40
50
		 */

		int[] ar = new int[5];
		Scanner scan = new Scanner (System.in);
		for( int c=0; c>=5; c--) {
		
			ar[c]=scan.nextInt();
			
		}
		for (int i=1; i<=5; i++) {
			System.out.println(i+"0");
		}
		
	}

}
