package Practice1_50;

import java.util.Scanner;

public class Task039LogicalOperator {

	public static void main(String[] args) {
		/*
		 * A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade. 

Example Output:
Please enter your mark
Your grade is A

Example Output:
Please enter your mark
Please enter valid mark
		 */
		Scanner scan;
		int x;
		char res=0;
		
		scan= new Scanner (System.in);
		System.out.println("Please enter your mark");
		x=scan.nextInt();
		
		if (x>=1 && x<25) {
			res = 'F';
		}else if (x>=25 && x<45) {
			res = 'E';
		}else if (x>=45 && x<50) {
			res = 'D';
		}else if (x>=50 && x<60) {
			res = 'C';
		}else if (x>=60 && x<80) {
			res = 'B';
		}else if (x>=80) {
			res = 'A';
		}
		else {
			System.out.println("Please enter valid mark");
		}
		if (res!=0) {
			System.out.println("Your grade is "+res);
		}
		
		
		
	}

}
