package Practice101_150;

class Main1 {

	/*
	 * Create a class named 'Main' with specific attributes. Create two objects of
	 * that class in which you will be assigning the following values and then print
	 * them.
	 * carColor='Black' carYear=2019 carMake='BMW'
	 * 
	 * carColor='White' carYear=2018 carMake='Toyota'
	 * 
	 * Expected Output: 
	 * Car color is Black and car year is 2019 and car model is BMW
	 * Car color is White and car year is 2018 and car model is Toyota
	 */
	
	String carColor;
	int carYear;
	String carMake;
	
	public static void main(String[] args) {
		
		Main1 obj1 = new Main1();
		obj1.carColor="Black";
		obj1.carYear=2019;
		obj1.carMake="BMW";
		System.out.println("Car color is "+obj1.carColor+" and year is "+obj1.carYear+" and car model is "+obj1.carMake);
		
		Main1 obj = new Main1();
		obj.carColor="White";
		obj.carYear=2018;
		obj.carMake="Toyota";
		System.out.println("Car color is "+obj.carColor+" and year is "+obj.carYear+" and car model is "+obj.carMake);
	}
}
