package javaprogramstl;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		
		
		int value =convertNegativeToPositive(-110);

		
		System.out.println(value);
		
		
		
		
		

	}
	
	
	public static int convertNegativeToPositive(int num)
	
	{
		
		if (num<0)
		{
			
			num=-num;
			
		}
		
		return num;
		
		
	}

}
