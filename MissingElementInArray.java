package javaprogramstl;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6,10,8,5};

		int missingElementInArray = missingElementInArray(arr);

		System.out.println(missingElementInArray);

	}

	public static int missingElementInArray(int[] data)

	{

		Arrays.sort(data);

		int expectedTotal = 0;

		int actualTotal = 0;

		for (int i = 0; i < data.length; i++)

		{
			actualTotal = actualTotal + data[i];

		}

		for (int i = data[0]; i <= data[data.length - 1]; i++) {

			expectedTotal = expectedTotal + i;

		}

		return expectedTotal - actualTotal;

	}

}
