package week3.day1;

public class Bike extends Vehicle {
	
	public void gearBike() {
		System.out.println("Gear Bike");

	}

	public static void main(String[] args) {
		Bike bk = new Bike();
		bk.gearBike();
		bk.noOfWheels();
		

	}

}
