package Practice1_50;

import java.util.Scanner;

public class Task035LogicalOperator {

	public static void main(String[] args) {
		/*
		 * Create a program that prompt user with question:  "Do you need a loan?"
If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
Based on the score define users eligibility:
if score is below  600 --> eligibility = "Not eligible"
if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

Output: 
"The eligibility is ____"
		 */
		
  String eligibility;
  int score;
  boolean loan;
  Scanner scan = new Scanner (System.in);
  System.out.println("Do you need a loan?");
  loan = scan.nextBoolean();
  
  if (loan) {
	  System.out.println("What is your credit score?");
	   score = scan.nextInt();
	  if (score < 600) {
		  eligibility  = "Not eligible";
	  }else if (score>=600 && score<=700) {
		  eligibility = "Maybe eligible";
	  }else if (score>=701 && score<=800) {
		  eligibility ="Eligibile";
	  }else {
		  eligibility ="Definitely eligible";
	  }
	  }else {
		  eligibility = "Unknow";
	  } 
	  System.out.println("The eligibility is " + eligibility);
  }
	
  }

