package Practice101_150;

public class Task113JavaMethod {

	/*
	 * Create a method with the following specks:
	 * 
	 * Returns: an integer Name: sumEvenToX Parameters: an integer called "x"
	 * Purpose: calculate the sum of the EVEN integers from 1 to x (including x)
	 * 
	 * Examples: 
	 * sumEvenToX(5) ==> 6 --> 2+4=6 
	 * sumEvenToX(8) ==> 20 --> 2+4+6+8=20
	 */
	
	int sumEvents(int x) {
	
	int sum = 0;
	
	for (int i=0; i<=x; i+=2) {
		sum=sum+i;
	} 
    System.out.println(sum);
    return x;
	}
	public static void main(String[] args) {
		
		Task113JavaMethod obj = new Task113JavaMethod();
		obj.sumEvents(5);
		obj.sumEvents(8);
		
	}
}