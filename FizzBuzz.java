package javaprogramstl;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		
		
		List<String> fizzBuzz = fizzBuzz(1,100);
		
		for(String e: fizzBuzz)
		{
			
			System.out.println(e);
		}

	}
	
	
	
	
	public static List<String> fizzBuzz(int start, int stop)
	
	
	{
		List<String> value = new ArrayList<String>();
	
		for (int i=start; i<=stop;i++)
			
		{
			
			if (i%3 ==0 && i%5==0)
				
			{
				
			    value.add("FizzBuzz");
			}
			
			else if (i%3==0)
			{
				
				value.add("Fizz");
				
			}
			
			else if ( i%5==0)
			{
				
				value.add("Buzz");
			}
			
			else
			{
				value.add(String.valueOf(i));
				
			}
			
		}
		
		return value;
		
	}

}
