package Practice1_50;

import java.util.Scanner;

public class Task038LogicalOperator {
	/*
	 * For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____"
	 */

	public static void main(String[] args) {
		Scanner scan;
		boolean day;
		String res;
		
		scan= new Scanner (System.in);
		System.out.println("Is it weekend?");
		day= scan.nextBoolean();
		
		if (!day) {
			res="Manual testing";
		}else {
			res="Java";
		}
		System.out.println("Today you will be learning "+res);
	}

}
