package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		
		int num1 = 13;
		
		boolean fvalue = false;
		
		for (int i = 2; i < num1 / 2; i++) {
			
			int rem = num1 % i;
			
			if (rem == 0)
			{
				fvalue = true;
				
			}
			
			break;
			
		}
		
		if(fvalue == false)
		{
			System.out.println(num1 + " " + "is a Prime number");
		}
		else
		{
			System.out.println(num1 + " " + "is not a Prime number");
		}
	
		
	}

}
