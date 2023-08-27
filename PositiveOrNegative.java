package javaprogramstl;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		
		boolean positiveOrNegative = positiveOrNegative(-33);
		
		if (positiveOrNegative)
		{
			System.out.println("positive number");
			
		}
		
		else
		{
			
			System.out.println("negative number");
		}
		
	}
	
	
	
	
	public static boolean positiveOrNegative(int num)
	
	{
		
		if(num >0)
			
		{
			return true;
			
		}
		
		
		return false;
		
	}

}
