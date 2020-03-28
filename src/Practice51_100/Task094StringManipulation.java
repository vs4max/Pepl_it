package Practice51_100;

import java.util.Scanner;

public class Task094StringManipulation {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * If browser is ChRoME it should print the: "Proceed with Chrome browser"
		 * 
		 * If browser is FireFOX it should print the: "Proceed with Firefox browser"
		 * 
		 * If browser is IE it should print the: "Proceed with IE browser"
		 * 
		 * If any other browser it should print the: "Invalid browser"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter ");
		String browser = scan.nextLine();
		
		if (browser.equalsIgnoreCase("ChRoME")) {
			System.out.println("Proceed with Chrome browser");
		}else if (browser.equalsIgnoreCase("FireFox")) {
			System.out.println("Proceed with Firefox browser");
		}else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("Proceed with IE browser");
		}else {
			System.out.println("Invalid browser");
		}
		
	}

}
