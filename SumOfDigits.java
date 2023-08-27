package javaprogramstl;

public class SumOfDigits {

	public static void main(String[] args)
	{
		
		int sumOfDigits = sumOfDigits(1234);
		
		System.out.println(sumOfDigits);
		
		

	}
	
	
	
	
	
	public static int sumOfDigits(int num)
	
	{
		
		
		
		
		int total=0;
		
		while (num>0)
		{
			
			
			int b=num%10;
			
			total=total+b;
			

			num=num/10;
			
		}
		
		
		return total;
		
		
		
		
		
		
	}

}
