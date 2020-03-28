package Practice51_100;

public class Task091StringManipulation {

	public static void main(String[] args) {
		/*
		 * For you to do:

Create a String given="I love Java classes at Syntax"
Retrieve 2 Strings from given String and print them 

Expected Output:
classes at Syntax
I love Java

		 */

		String given = "I love Java classes at Syntax";
		/*
		 for (String retval : given.split(" classes", 2)) {
	            System.out.println(retval);
	        }
		 System.out.println();
		 */
	/*	
		for (String retval : given.split(" ")) {
	         System.out.println(retval);
	      }
		*/
		String a1=given.substring(12);
		System.out.println(a1);
		a1=given.substring(0, 11);
		System.out.println(a1);
	}
	

}
