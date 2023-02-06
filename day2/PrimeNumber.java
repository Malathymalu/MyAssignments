package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {	
	int p=13;
	boolean a=false;
	for(int i=2; i<p/2;i++) {	
		if (p%i==0)	
		{
			System.out.println("This is not a prime number");	
			a = true;	
			break;
		}	
	}
	if (!a) {
		
		System.out.println("This is PrimeNmber");
	}		
	}
}
