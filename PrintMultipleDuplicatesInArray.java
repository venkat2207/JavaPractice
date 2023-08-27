package javaprogramstl;

import java.util.ArrayList;
import java.util.List;

public class PrintMultipleDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20, 11, 15 };

		List<Integer> printDuplicates = printDuplicates(arr);

		for (Integer e : printDuplicates)

		{
			System.out.println(e);

		}

	}

	public static List<Integer> printDuplicates(int[] data)

	{
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length - 1; j++)

			{

				if (data[i] == data[j])

				{
					list.add(data[i]);

				}
			}

		}
		return list;

	}

}
