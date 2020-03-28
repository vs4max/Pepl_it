package Practice51_100;

public class Task089StringManipulation {

	public static void main(String[] args) {
		/*
		 * Validate if the string ends with "u" prints the boolean value accordingly.
		 * Validate if the string ends with "world" prints the boolean value accordingly. 
		 * Validate if the string ends with "are" prints the boolean value accordingly. 
		 * Validate if the string ends with "you" prints the boolean value accordingly.
		 */
		String s1 = "hello how are you";
	
		boolean a1 = s1.endsWith("u");
		System.out.println(a1);
		boolean a2 = s1.endsWith("world");
		System.out.println(a2);
		boolean a3 = s1.endsWith("are");
		System.out.println(a3);
		boolean a4 = s1.endsWith("you");
		System.out.println(a4);
		 
		
		
		
	}

}
