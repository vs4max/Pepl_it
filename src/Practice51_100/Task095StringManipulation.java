package Practice51_100;

public class Task095StringManipulation {

	public static void main(String[] args) {
		/*
		 * Create a String given="Hello Syntax friends". 
Using String methods from given String create new String "Welcome Syntax family"

Expected Output:
Welcome Syntax family
		 */
		
		String given = "Hello Syntax friends";
		given = given.replace("Hello", "Welcome");
			String givennew = given.replace("friends", "family");
		System.out.println(givennew);
		
	}

}
