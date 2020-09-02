package javaActivity2;

public class Bicycle implements BicycleParts,BicycleOperations {
	
	public int gears = 0;
	public int currentSpeed = 0;

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		this.currentSpeed -=  decrement;
		System.out.println("Current speed: " + currentSpeed);
	}

	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		this.currentSpeed +=  increment;
		System.out.println("Current speed: " + currentSpeed);
	}
	
	public Bicycle(int gears,int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
		
		
	}

	public String bicycleDesc() {
	    return("No of gears are "+this.gears + "\nSpeed of bicycle is " +this.currentSpeed);
	}
}
