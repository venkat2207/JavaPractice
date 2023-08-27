package javaprogramstl;

public class PrimeNumber {

	public static void main(String[] args) {

		boolean primeNumber = isPrimeNumber(139);

		if (primeNumber) {
			System.out.println("prime number");

		}

		else {

			System.out.println("not prime number");

		}

	}

	@SuppressWarnings("unused")
	public static boolean isPrimeNumber(int num)

	{

		if (num < 2)

		{
			return false;

		}

		if (num == 2)

		{

			return true;
		}

		for (int i = 2; i < num; i++)

		{

			if (num % i == 0) {
				break;

			}

			return true;

		}

		return false;

	}

}
