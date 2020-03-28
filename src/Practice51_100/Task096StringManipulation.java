package Practice51_100;

import java.util.Scanner;

public class Task096StringManipulation {

	public static void main(String[] args) {
		/*
		 * Given the following inputs:
String s;

Write a for loop that will print out the reverse of the string.

Sample input/outputs:
In: manhattan
nattahnam

In: processor
rossecorp

In: racecar
racecar
		 */
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String s = inp.nextLine();
	    //write your code below
	    char reverse;
	    for(int i = s.length()-1; i>-1; i--) {
	    reverse = s.charAt(i);
	    System.out.print(reverse);
		
	    }
	}

}
