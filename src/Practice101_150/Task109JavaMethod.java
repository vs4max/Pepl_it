package Practice101_150;

public class Task109JavaMethod {

	/*
	 * For you to do 

Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes 
Step3: Call the method

Expected Output:
11:30
	 */
	
	void num(int a, int b){
		System.out.println(a+":"+b);
	}
	public static void main(String[] args) {
		
		Task109JavaMethod obj  = new Task109JavaMethod();
		obj.num(11, 30);
		
	}
}
