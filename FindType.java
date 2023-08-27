package javaprogramstl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindType {

	public static void main(String[] args) {

		Map<String, Integer> findType = findType("$$ Welcome to 22nd Class of Automation $$ ");

		for (Entry<String, Integer> entry : findType.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

	}

	public static Map<String, Integer> findType(String name)

	{

		// int letter = 0, space = 0, num = 0, specialChar = 0;

		Map<String, Integer> myMap = new HashMap<String, Integer>();

		myMap.put("letter", 0);

		myMap.put("space", 0);

		myMap.put("num", 0);

		myMap.put("specialChar", 0);

		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++)

		{

			if (Character.isLetter(charArray[i]))

			{

				myMap.put("letter", myMap.get("letter") + 1);

			}

			else if (Character.isDigit(charArray[i]))

			{

				myMap.put("num", myMap.get("num") + 1);

			}

			else if (Character.isSpaceChar(charArray[i]))

			{

				myMap.put("specialChar", myMap.get("specialChar") + 1);

			}

			else {

				myMap.put("space", myMap.get("space") + 1);

			}

		}

		return myMap;

	}

}
