package javaActivity2;

public class MountainBike extends Bicycle {
	
	public int seatHeight = 0;

	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}
	public void setHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	public String bicycleDesc() {
		return (super.bicycleDesc()+"\nseat Height :"+this.seatHeight);
	}
	

}
