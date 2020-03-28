package Practice1_50;

import java.util.Scanner;

public class Task042SwitchStatement {

	public static void main(String[] args) {
		/*
		 * Write a program using the switch statement Let us consider there are three
		 * students in the class with roll number starting from (101 to 103) if any
		 * number other than 101-103 are present display
		 * "Not found Student name: in Class"
		 * 
		 * First Output: "enter the roll number of the Child"
		 * 
		 * case 101: if roll number is 101 print as "Student name: Ramesh "
		 * 
		 * case 102 :if roll number is 102 print as "Student name: Mahesh "
		 * 
		 * case 103:if roll number is 103 print as "Student name: Mukesh "
		 * 
		 * Other than this roll number it should print
		 * "Not found Student name: in Class"
		 * 
		 */

		System.out.println("Enter the roll number of the Child");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String name="a";
		switch (n) {
		case 101:
		name="Remesh";
		break;
		case 102:
			name ="Mahesh";
			break;
		case 103:
			name="Mukesh";
			break;
			default:
				System.out.println("Not found Sudent name in Class");
		}
		if (!name.contentEquals("a")) {
			System.out.println("Student name: "+name);
		}	
	}
}
