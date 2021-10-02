package week1.day1;

public class NegativeNumToPostiveNum {

	public static void main(String[] args) {

		int num = 40;
		
		if(num < 0)
		{
			int posnum = Math.abs(num);
			
			System.out.println("The number " + num + " is converted to " + posnum);
		}
		else
		{
			System.out.println("The given number " + num + " is a Postive number");
		}
	}

}
