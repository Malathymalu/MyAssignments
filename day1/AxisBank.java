package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposit amout - "+ 600000);

	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();
	

	}

}
