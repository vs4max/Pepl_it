package Practice1_50;

import java.util.Scanner;

public class Task045SwitchStatement {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter any number from 1-7. Based on the number define the day
		 * of the week
		 * 
		 * 
		 * Example Output: Input a number between 1-7 Friday
		 * 
		 * Example Output: Input a number between 1-7 Invalid
		 */

		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		String today;
		switch (day) {
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "Invalid";
		}
		System.out.println(today);

	}

}
