package Practice1_50;

import java.util.Scanner;

public class Task034NestedIfScanner {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using nested if condition
Please use Scanner class to take input from users

Expected Output:
Please enter 3 distinct numbers
The largest number is 14
		 */
	
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1==num2 || num1==num3) {
			System.out.println("Invalid number");
		}else if (num1>num2 && num1>num3) {
			System.out.println(num1 +" is the largest number");
		}else if (num2==num1 || num2==num3) {
			System.out.println("Invalid number");
		}else if (num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest number");
		}else if (num3==num1 || num3==num2) {
			System.out.println("Invalid number");
		}else {
			System.out.println(num3+" is the largest number");
		}
		
	}

}
