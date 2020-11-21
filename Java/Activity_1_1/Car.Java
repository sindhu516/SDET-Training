package JavaActivity1_1;

//  Defining class and properties

public class Car {

	String color;

	String transmission;

	int make;

	int tyres;

	int doors;

//	Constructor

	public Car() {

		this.tyres = 4;

		this.doors = 4;

	}

	public void displayCharacteristics() {

		System.out.println("Colour of the car is: " + color);

		System.out.println("Transmission of the car is:" + transmission);

		System.out.println("Make: "+ make);

		System.out.println("No. of tyres :"+ tyres);

		System.out.println("No. of doors :"+ doors);

	}

	public void accelerate() {

		System.out.println("Car is moving forward.");

	}

	public void brake(){

		System.out.println("Car has stopped.");

	}

}
