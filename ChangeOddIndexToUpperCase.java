package javaprogramstl;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String changeOddIndex = changeOddIndex("changeme");

		System.out.println(changeOddIndex);

	}

	public static String changeOddIndex(String name)

	{

		char[] charArray = name.toCharArray();

		String oddUpper = "";

		for (int i = 0; i < charArray.length; i++)

		{

			if (i % 2 == 0)

			{
				oddUpper = oddUpper + Character.toUpperCase(charArray[i]);

			} else {
				oddUpper = oddUpper + charArray[i];

			}

		}

		return oddUpper;

	}

}
