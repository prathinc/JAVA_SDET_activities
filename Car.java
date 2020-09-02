package javaActivity1;

public class Car{
	
	int make = 0;
	String color = null;
	String transmission = null;
	int tyres = 0;
	int doors = 0;
	
	
	
	public void displaycharcteristics() {
		
		System.out.println("Make of car :"+make);
		System.out.println("Color of car :"+color);
		System.out.println("Transmission type of car :"+transmission);
		System.out.println("No of Tyres for car :"+tyres);
		System.out.println("No of Doors for car :"+doors);
		
		
	}
	
	public void accelerate() {
		
		System.out.println("Car is accelarting and moving forward");
		
	}
	
	public void brake() {
		System.out.println("Car stopped");
	}
	
     public Car(int tyres,int doors) {
		
		this.tyres = tyres;
		this.doors = doors;
		
	}
}
