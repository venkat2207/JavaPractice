package javaprogramstl;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String reverseEven = reverseEven("I am a software tester");

		System.out.println(reverseEven);

	}

	public static String reverseEven(String name)

	{
		String[] split = name.split(" ");

		String convertedName = "";

		for (int i = 0; i < split.length; i++)

		{

			if (i % 2 == 1)

			{

				String reverse = reverse(split[i]);

				convertedName = convertedName + reverse + " ";

			}

			else

			{

				convertedName = convertedName + split[i] + " ";
			}

		}

		return convertedName;

	}

	public static String reverse(String name)

	{
		String reverse = "";

		char[] charArray = name.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--)

		{
			reverse = reverse + charArray[i];

		}

		return reverse;

	}

}
