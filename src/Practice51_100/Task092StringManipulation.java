package Practice51_100;

import java.util.Scanner;

public class Task092StringManipulation {

	public static void main(String[] args) {
		/*
		 * For you to do:

         Using Scanner class input string value. 
         Print out the following: "The first 3 letters of ___ is ___"

         For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".

		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter String : ");
		String word = scan.nextLine();
		
		String word1=word.substring(0, 3);
		System.out.println("The first 3 letters of "+word +" is "+word1);
	}

}
