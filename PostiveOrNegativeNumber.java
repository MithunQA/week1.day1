package week1.day1;

public class PostiveOrNegativeNumber {

	public static void main(String[] args) {
		
		int number = 1;
		
		if(number > 0)
		{
			System.out.println("The given number " + number + " is a Postive number");
		}
		else if (number < 0)
		{
			System.out.println("The given number " + number + " is a Negative number");
		}
		else
		{
			System.out.println("The given number " + number + " is neither Postive nor Negative number");
		}
	}

}
