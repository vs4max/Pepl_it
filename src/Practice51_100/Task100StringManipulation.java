package Practice51_100;

import java.util.Scanner;

public class Task100StringManipulation {

	public static void main(String[] args) {
		/*
		 *  Given the following inputs:
String s;

Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.

Sample input/outputs:
In: hello
h e l l o

In: covert
c o v e r t

In: blasphemy
b l a s p h e m y
		 */
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
		    char[] strToArray = s.toCharArray(); // Преобразуем �?троку s в ма�?�?ив �?имволов (char)
		      // Вывод ма�?�?ива на �?кран
		      for(int i = 0; i < strToArray.length; i++) {
		         System.out.print(strToArray[i] + " "); // Дл�? нагл�?дно�?ти в�?тавим пробел между индек�?ами
		      } 
		
		
	}

}
