package Practice1_50;

public class Task014ArithmeticOperators {
	
	/*
	 * For you to do
Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
Print the following statement:
_______ modded by _______ is ______
result2           result1    blank3
where blank3 is the remainder of result1 into result2
	 */
	public static void main(String[] args) {
 		int num1 = 11;
    int num2 = 3;
    int num3 = 8;
    
    int num4 = 7; 
    int num5 = 4;
    int num6 = 2;
    
    //start coding here
    int result1=(num1+num2)-num3;
    int result2=num4*num5/num6;
    int mod=result2%result1;
    
    System.out.println(result2+" modded by "+result1+" is "+mod);

}
}
