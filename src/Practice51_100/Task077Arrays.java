package Practice51_100;

import java.util.Scanner;

public class Task077Arrays {

	public static void main(String[] args) {
		/*
		 * For you to do:
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order. 

Example: 
Input: 
1
2
3
4
5
Output:
5
4
3
2
1
		 */
		int[] ar = new int[5];
		Scanner scan = new Scanner (System.in);
		for( int c=0; c>=5; c--) {
		
			ar[c]=scan.nextInt();
			
		}
		for (int i=5; i>=1; i--) {
			System.out.println(i);
		}
	
	}

}
