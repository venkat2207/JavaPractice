package javaprogramstl;

public class Factorial {

	public static void main(String[] args) {
		
	      int result = factorial(7);
	      
	      System.out.println(result);
		

	}
	
	
	public static int factorial(int num)
	{
		
		int f=1;
		
		
		for (int i=1; i<=num;i++)
		{
			
			f=f*i;
			
			
			
		}		
		
		return f;
	}
	

}
