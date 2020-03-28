package Practice51_100;

import java.util.Scanner;

public class Task076Arrays {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program that creates a String array with size 7. 
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array

Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday etc

Example Output:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
		 */
		
Scanner scan = new Scanner (System.in);
System.out.println("Please enter day 1 of the week");	
String day1=scan.nextLine();
System.out.println("Please enter day 2 of the week");	
String day2=scan.nextLine();
System.out.println("Please enter day 3 of the week");	
String day3=scan.nextLine();
System.out.println("Please enter day 4 of the week");	
String day4=scan.nextLine();
System.out.println("Please enter day 5 of the week");	
String day5=scan.nextLine();
System.out.println("Please enter day 6 of the week");	
String day6=scan.nextLine();		
System.out.println("Please enter day 7 of the week");	
String day7=scan.nextLine();

String []week= {day1,day2,day3,day4,day5,day6,day7};

for(int i=0; i<week.length; i++) {
System.out.println(week[i]);
	}
	
	}
}
