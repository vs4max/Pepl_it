package Practice51_100;

public class Task067NestedForLoop {
public static void main(String[] args) {
	
	/*
	 * Write a program to print out the pattern: 

1 2 3 4 5 6 7 8 9 10 
2 4 6 8 10 12 14 16 18 20 
3 6 9 12 15 18 21 24 27 30 
4 8 12 16 20 24 28 32 36 40 
5 10 15 20 25 30 35 40 45 50
 */
	
	for(int a=1; a<=10; a++) {
		System.out.print(a+" ");
	}System.out.println();
		for(int b=2; b<=20; b++) {
			if(b%2==0) {
				System.out.print(b+" ");
			}}System.out.println();
				
			for(int c=3; c<=30; c++) {
				if(c%3==0) {
					System.out.print(c+" ");
				}}System.out.println();
					for(int d=4; d<=40; d++) {
						if(d%4==0) {
							System.out.print(d+" ");
						}}System.out.println();
							
							for(int e=5; e<=50; e++) {
								if(e%5==0) {
									System.out.print(e+" ");
								}}
		
	
}
}