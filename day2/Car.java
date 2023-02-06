package week1.day2;

public class Car {
public static void main(String[] args) {
	
	Car car = new Car();
	
	car.getregistrationnumber(12345);
	car.getOwnerName("Mani");
	car.printCarModel();
	car.isPunctured();
	int result = car.substractTwoNumbers(20, 10);
	System.out.println(result);
	car.addTwoNumbers();
	int result1 = car.multiplyingThreeNumbers(10, 20, 30);
	System.out.println(result1);
	int result2 = car.divisionTwo(10, 2);
			System.out.println(result2);
}
	public int getregistrationnumber(int num)
	{
 System.out.println("Registration Number"+num);
return num;
	}
	private String getOwnerName(String name) 
	{
		System.out.println("Owner Name"+name);
return name;
	}
	void printCarModel() 
	{
	 {		
System.out.println("Swift");
	}	
}
	public boolean isPunctured() 
	{		
boolean output= false;
System.out.println(output);
return false;
	}
	public int substractTwoNumbers(int a, int b)
	{
		 return a-b;	
	}
	public void addTwoNumbers() 
	{
		int a =  100;
		
		int b = 200;
		
		System.out.println(a+b);
	
}
	private int multiplyingThreeNumbers(int a,int b,int c) 
	{
		return a*b*c;

	}
	private int divisionTwo(int a,int b) 
	{
		
return a/b;
	}
}

