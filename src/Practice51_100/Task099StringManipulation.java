package Practice51_100;

import java.util.Scanner;

public class Task099StringManipulation {

	public static void main(String[] args) {
		/*
		 * For you to do: 

Inputs:
String word;

Write a for loop that will loop through every character of a word and print out each character, each on a separate line 

 Sample inputs/outputs:
In: hello
h
e
l
l
o

In: zimbabwe
z
i
m
b
a
b
w
e

In: wow!
w
o
w
!

		 */

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
		 char[] strToArray = word.toCharArray(); // Преобразуем �?троку s в ма�?�?ив �?имволов (char)
	      // Вывод ма�?�?ива на �?кран
	      for(int i = 0; i < strToArray.length; i++) {
	         System.out.println(strToArray[i] + " "); // Дл�? нагл�?дно�?ти в�?тавим пробел между индек�?ами
	      } 
	
		
	}

}
