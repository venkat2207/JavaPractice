package javaprogramstl;

public class Palindrome {

	public static void main(String[] args) {

		boolean palindrome = isPalindrome("Mada");

		if (palindrome) {
			System.out.println("palindrome");

		}

		else

		{
			System.out.println("not a palindrome");

		}

	}

	public static boolean isPalindrome(String name)

	{

		String reverse = reverseString(name);

		if (reverse.equalsIgnoreCase(name))

		{

			return true;
		}

		else {

			return false;
		}

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
