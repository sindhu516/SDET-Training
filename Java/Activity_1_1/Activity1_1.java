package JavaActivity1_1;

public class Activity1 {
	
	public static void main(String[] args) {

		Car Benz = new Car();

		Benz.color = "black";

		Benz.transmission = "Auto";

		Benz.make = 0;

		Benz.doors = 2;

		Benz.tyres = 4;

		Benz.displayCharacteristics();

		Benz.accelerate();

		Benz.brake();

	}
}
