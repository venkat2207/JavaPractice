package javaprogramstl;

public class CharOccurenceCount {

	public static void main(String[] args) {

		int charCount = charCount("welcome to chennai", 'n');

		System.out.println(charCount);

	}

	public static int charCount(String name, char c)

	{
		int count = 0;

		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == c) {

				count = count + 1;

			}

		}

		return count;

	}

}
