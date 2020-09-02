package javaActivity1;

public class Activity1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tyres =4;
		int doors =4;
		
		Car Ford = new Car(tyres,doors);
		
		Ford.make = 2014;
		Ford.color = "Black";
		Ford.transmission = "Manual";
		
		Ford.displaycharcteristics();
		Ford.accelerate();
		Ford.brake();

	}

}
