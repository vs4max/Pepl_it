package Practice1_50;

import java.util.Scanner;

public class Task041SwitchStatement {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program using the switch statement  
Let us consider the scenario regarding the born baby age 

First Output: "enter the age of the Child"

case 1: if age is 1 print as "You can Crawl"

case 2 : if age is 2 print as  "You can Talk"

case 3: If age is 3 print as "You can Dance"

case 4: if age is 4 print as "You can get  Trouble"

Other than this age (1-4) it should print "I don't know how old you are" 
		 */

		System.out.println("Enter the age of the Child");
		Scanner scan= new Scanner (System.in);
		int age = scan.nextInt();
		String res= "0";
		switch (age) {
		case 1 :
			res="Crawl";
			break;
		case 2 :
			res="Talk";
			break;
		case 3 :
			res="Dance";
			break;
		case 4:
			res="get Trouble";
			break;
			default:
				System.out.println("I dont know how old you are");	
		}
		if (!res.equals("0")) {
			System.out.println("You can "+res);
		}
}

}
