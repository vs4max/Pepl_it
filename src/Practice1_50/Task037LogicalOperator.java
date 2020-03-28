package Practice1_50;

import java.util.Scanner;

public class Task037LogicalOperator {

	public static void main(String[] args) {
		/*
		 * For you to do: Take 2 boolean inputs from a user:
		 * 
		 * "Are you thirsty?" "Are you sleepy?"
		 * 
		 * If user is thirsty and not sleepy--> drink=Water
		 * If user is thirsty and sleepy--> drink=Coffee 
		 * If user is not thirsty and sleepy --> drink=Tea
		 * Otherwise drink="Nothing"
		 * 
		 * Output: "Looks like you need to drink ___ "
		 * 
		 */
		boolean answ1;
		boolean answ2;
		String drink;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		answ1 = scan.nextBoolean();
		System.out.println("Are you sleepy?");
		answ2 = scan.nextBoolean();
		
		if (answ1 && !answ2) {
			drink="Water";
			
		}else if (answ1 && answ2) {
			drink="Coffee";
			
		}else if (!answ1 && !answ2) {
			drink="Tea";
			
		}else {
			drink="Nothing";
		}
		System.out.println("Looks like you need to drink "+drink);
	}

}
