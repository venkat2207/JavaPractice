package javaprogramstl;

public class ReverseString {

	public static void main(String[] args) {

		String reverseString = reverseString("malayalame");

		System.out.println(reverseString);

	}

	public static String reverseString(String name)

	{

		char[] charArray = name.toCharArray();

		String reverseName = "";

		for (int i = charArray.length - 1; i >= 0; i--) {

			reverseName = reverseName + charArray[i];

		}

		return reverseName;

	}

}
