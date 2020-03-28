package Practice101_150;

public class Task114JavaMethod {

	

	/*
	 * Returns:
a String
Name:
spaceOut
Parameters:
a String

Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).

Examples:
spaceOut("hello") ==> "h e l l o "
spaceOut("technology") ==> "t e c h n o l o g y "
	 */
	
	
	
	String spaceOut(String s) {
	
		char [] sArray = s.toCharArray();
		for(int i=0; i<sArray.length; i++) {
			System.out.print(sArray[i]+" ");
		
		}
		System.out.println();
		return s;
		
	}
	public static void main(String[] args) {
		Task114JavaMethod method = new Task114JavaMethod();	
		String s= method.spaceOut("hello");
               s=method.spaceOut("technology");
	}
}
 	/*
*class Main {
  String spaceOut(String s) {
   s = s.replaceAll(“”, ” “);
		return s;
	}
		  public static void main(String[] args) {
		    Main obj = new Main();
		    System.out.println(obj.spaceOut(“hello”));
		    System.out.println(obj.spaceOut(“technology”));
		  }
		}
*/