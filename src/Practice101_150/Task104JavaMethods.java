package Practice101_150;

public class Task104JavaMethods {

	/*
	 * For you to do:

1. create method and name as m1. Inside your method body add print statement as "m1 method implementation"
2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
3. Call these two methods in the main method

Expected Output:
m1 method implementation
m2 method implementation
	 */
	
	void m1() {
		System.out.println("m1 method implementation");
	}
	void m2() {
		System.out.println("m2 method implementation");
	}
	public static void main(String[] args) {
		Task104JavaMethods obj = new Task104JavaMethods();
		obj.m1();
		obj.m2();
	}
}
