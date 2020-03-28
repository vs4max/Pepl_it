package Practice51_100;

import java.util.Scanner;

public class Task064ForLoop {

	public static void main(String[] args) {
		/*
		 * For you to do:
You should input:
int end;

Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.

Each number should be on the same line, separated by a space. 

 Example Output:
Int: 5
0 1 2 3 4 5 6 7 8 9

Int: 8
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15

In: -5
(no output) 
		 */

		Scanner inp = new Scanner(System.in);
	    int end;
	    int b;
	int a;
	    System.out.print("Int:");
	    //write your code below
	    end=inp.nextInt();
	  a=end+end;
	    for(b=0; b<a; b++ ) {
	    	System.out.print(" "+b+" ");
	    }
		
	}

}
