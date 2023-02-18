package week3.day1;

public class Suzuki extends Bike{
	public void noOfMirror() {
		System.out.println("No Of Mirror");

	}

	public static void main(String[] args) {
		Suzuki su = new Suzuki();
		su.noOfWheels();
		su.noOfMirror();

	}

}
