package Practice101_150;

public class Task107JavaMethods {

	/*
	 * For you to do:

1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
3. Call both methods

Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!
	 */
	
	void sysntaxTechnologies() {
		System.out.println("Welcome to Syntax Technologies");
	}
	void syntaxStudents() {
		System.out.println("Welcome Syntax Students");
	}
	public static void main(String[] args) {
		Task107JavaMethods obj = new Task107JavaMethods();
		obj.sysntaxTechnologies();
		obj.syntaxStudents();
	}
}
