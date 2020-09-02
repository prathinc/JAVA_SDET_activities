package javaActivity2;


public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Plane plane = new Plane(10);
		plane.onBoard("Ria");
		plane.onBoard("Mia");
		plane.onBoard("Lilly");
		
		System.out.println("Plane take Off at time :"+plane.takeOff());
		System.out.println("Passengers in plane :"+plane.getPassengers());
		Thread.sleep(5000);
		
		plane.land();
		System.out.println("Plane landing time :"+plane.getLastTimeLanded());
		System.out.println("Passengers in plane after landing :"+plane.getPassengers());
		
	}

}
