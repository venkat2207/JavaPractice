package javaprogramstl;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		int printDuplicates = printDuplicates(arr);

		System.out.println(printDuplicates);

	}

	public static int printDuplicates(int[] data)

	{
		int value = -1;
		
		

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length - 1; j++)

			{

				if (data[i] == data[j])

				{
					value = data[i];

				}
			}

		}
		return value;

	}

}
