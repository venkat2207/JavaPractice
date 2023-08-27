package javaprogramstl;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		List<Integer> fibonacci = fibonacci(1,1,12);
		
		for (Integer e: fibonacci)
			
		{
			System.out.println(e);
			
		}

	}
	
    public static List<Integer> fibonacci(int firstNum,int secondNum, int iterationCount)
    
    
    {
    	
    	List<Integer> list=new ArrayList<Integer>();
    	
    	list.add(firstNum);
    	
    	for ( int i=1; i<=iterationCount;i++)
    	{
    		
    		
    		
    		list.add(secondNum);
    		
    		int thirdNum=firstNum+secondNum;
        	
        	firstNum=secondNum;
        	
        	secondNum=thirdNum;
    		
    		
    		
    	}
    	
    	
    	
    	
    	return list;
    	
    	
    	
    }
	
	

	
	
	
}	
	
	
	
	
	
	

