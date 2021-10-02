package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int num1 = 0;
		int num2 =1;
		int totalnum;
		
		System.out.print(num1 + " ");
		
		for (int i = 1; i < 8; i++) {
			
			
			totalnum = num1+num2;
			
			num1 = num2;
			
			num2 = totalnum;
		
			System.out.print(num1 + " ");
			
		}
		
		
	}

}
