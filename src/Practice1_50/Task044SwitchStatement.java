package Practice1_50;

import java.util.Scanner;

public class Task044SwitchStatement {

	public static void main(String[] args) {
		/*
		 * For you to do: Prompt user with questions:
		 * "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 * 
		 * The output of your program should be: "Your favorite car is ___"
		 */
System.out.println("Please enter your favirite car make");
String car, car0;
Scanner scan=new Scanner (System.in);
car=scan.next();

switch (car) {
case "BMW":
car0="german car";
break;
case"Toyota":
car0="Japanese car";
break;
case"Maserati":
	car0="italian car";
	break;
	default:
		car0="Unknow";
		break;
}
System.out.println("Tour favorite car is "+car0); 
			
	}

}
