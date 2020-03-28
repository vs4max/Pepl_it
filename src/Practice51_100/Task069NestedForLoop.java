package Practice51_100;

public class Task069NestedForLoop {

	public static void main(String[] args) {
		/*
		 * For you to do: 
Write a program to print out the pattern: 

1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7
		 */

	for(int a=7; a>=1; a--) {
		
			for(int b=1; b<=a; b++) {
			
				System.out.print(b+" ");
			}
			System.out.println();
				
			}
	for(int a=2; a<=7; a++) {
		
			for(int b=1; b<=a; b++) {
		
			System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}	

