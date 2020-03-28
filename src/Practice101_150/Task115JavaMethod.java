package Practice101_150;

public class Task115JavaMethod {

	/*
	 * Returns:
a String
Name:
censorLetter
Parameters:
a String
a char

Then complete the method by programming the following behavior
Replace all instances of given character with a "*" within the given String.
See below examples.

Examples:
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
	 */
	

	static String censorLetter(String a, char b) {
		a=a.replace(b, '*');
		return a;
	}
	public static void main(String[] args) {
		System.out.println(censorLetter("computer science",'e'));
		System.out.println(censorLetter("trick or treat",'t'));
	}
}
	  