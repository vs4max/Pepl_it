package Practice1_50;
import java.util.Scanner;
public class Task021Scanner {
	/*
	 * For you to do: 
Write a program that asks the user's age: "Enter your age  "
Then display it by adding 10 (i.e age + 10) in your final output. 

Example Output: 
Enter your age 30
Your age after 10 years is 40

	 */
	 public static void main (String [] args ){
	     
	     Scanner scan = new Scanner (System.in);
	     System.out.println("Enter your age ");
	     
	     int a = scan.nextInt ();
	     int a1 = a + 10;
	     System.out.println("Your age after 10 years is "+a1);
	   }
}
