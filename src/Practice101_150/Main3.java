package Practice101_150;

public class Main3 {

	/*
	 * Create a Class Main 

In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:
 
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
	 */
	
	String breed;
	String name;
	String color;
	
	void bark() {
		System.out.println(breed+ " can bark");
	}
	void run() {
		System.out.println(breed+ " can run");
	}
	void play() {
		System.out.println(breed+ " can play");
	}
	public static void main(String[] args) {
		
		Main3 obj = new Main3();
		obj.breed="Husky";
		obj.name="Sharik";
		obj.color="black";
		obj.bark();
		obj.run();
		obj.play();
		
		Main3 obj1 = new Main3();
		obj1.breed="Bulldog";
		obj1.name="Kuzya";
		obj1.color="brown";
		obj1.bark();
		obj1.run();
		obj1.play();
		
		Main3 obj2 = new Main3();
		obj2.breed="Labrador";
		obj2.name="Toby";
		obj2.color="grey";
		obj2.bark();
		obj2.run();
		obj2.play();
	}
}
