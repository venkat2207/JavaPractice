package javaprogramstl;

public class OddNumber {

	public static void main(String[] args) {
		
		
		
		boolean number = isOddNumber(8);
		
		if(number)
		{
			
			System.out.println("odd number");
		}
		
		else
		{
			
			System.out.println("even number");
		}

	}
	
	
	
	
	public static boolean isOddNumber(int num)
	
	{
		if(num%2==1)
		{
			
			return true;
			
		}
		return false;
		
	}

}
