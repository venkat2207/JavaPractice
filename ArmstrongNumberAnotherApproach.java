package javaprogramstl;

public class ArmstrongNumberAnotherApproach {

	public static void main(String[] args) {

		boolean armstrong = isArmstrong(1633);

		if (armstrong) {

			System.out.println("armstrong number");
		}

		else {

			System.out.println("not a armstrong number");
		}

	}

	public static int digitCount(int num)

	{
		int count = 0;

		while (num > 0)

		{

			num = num / 10;

			count++;

		}

		return count;

	}

	public static boolean isArmstrong(int num)

	{
		int digitCount = digitCount(num);

		int value = num;

		int total = 0;

		while (num > 0)

		{
			int a = num % 10;

			int sum = 1;

			for (int i = 1; i <= digitCount; i++)

			{

				sum = sum * a;

			}

			// total = (int) (total + Math.pow(a, digitCount));

			total = total + sum;

			num = num / 10;

		}

		if (total == value) {

			return true;
		}

		else

		{

			return false;
		}

	}

}
