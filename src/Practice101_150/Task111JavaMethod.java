package Practice101_150;

public class Task111JavaMethod {

	/*
	 * Create a method that will accept a String as a parameter and return new String all in upper case

Call method

Expected Output:
TEST
	 */
	
	String method( String a) {
	a =a.toUpperCase();
	return a;
	}
	public static void main(String[] args) {
		
		Task111JavaMethod obj = new Task111JavaMethod();
		System.out.println(obj.method("test"));
		
	}
}
