package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
	
	//0,1,1,2,3,
	int firstNum = 0, secNum = 1, sum = 0;
	System.out.println("Fibonacci Series");
	System.out.println(firstNum);
	for(int i= 0;i<11;i++){
		
		sum = firstNum + secNum;
		firstNum = secNum;
		secNum=sum;
		
		System.out.println(sum);
		

	}
	
}
}
