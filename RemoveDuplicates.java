package javaprogramstl;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String duplicate = duplicate("We learn java basics as part of java sessions in java week1");

		System.out.println(duplicate);

	}

	public static String duplicate(String name)

	{

		String[] split = name.split(" ");

		String updatedName = "";

		for (int i = 0; i < split.length; i++)

		{
			for (int j = i + 1; j < split.length; j++)

			{
				if (split[i].equalsIgnoreCase(split[j]))

				{
					split[i] = "";

				}

			}

			updatedName = updatedName + split[i] + " ";

		}

		return updatedName;

	}

}
