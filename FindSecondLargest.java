package javaprogramstl;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		
		int[] data = {3,2,11,4,9,8};
		
		
		int secondLargest = secondLargest(data);
		
		System.out.println(secondLargest);
		

	}
	
	
	public static int secondLargest( int[] data)
	
	{
		
		Arrays.sort(data);
		
		return data[data.length-2];
		
		
	}

}
