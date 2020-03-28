package Practice1_50;
import java.util.Scanner;
public class Task020Scanner {
/*
 * For you to do: 
Write  a program that takes user's first name and surname and prints in console
Instruct the user to enter first name: "Please Enter First Name"
Capture the first name
Instruct the user to enter surname:"Please Enter Surname" 
Capture surname
Print first name and surname

Final Output: 
Example: 
Please Enter First Name
Please Enter Surname
Cindy Crawford
 */
	 public static void main(String [] args){
		    
		  Scanner scan = new Scanner (System.in);
			System.out.println("Please Enter First Name");
			
			Scanner scan1 = new Scanner (System.in);
			System.out.println("Please Enter Surname");
			
			String name = scan.nextLine();
			String lastname = scan.nextLine();
			System.out.println(name+" " + lastname);
			
		  
		  }
	
	
}
