package week3.day1;

public class Truck extends Vehicle {
	
	public void airBags() {
		System.out.println("AirBags");

	}

	public static void main(String[] args) {
		Truck tr = new Truck();
		tr.airBags();
		tr.noOfWheels();

	}

}
