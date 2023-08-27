package javaprogramstl;

public class SwitchCase {

	public static void main(String[] args) {
		
		int value = switchOperator(10,8, "sub");
		
		System.out.println(value);
		
		

	}

	public static int switchOperator(int a, int b, String operation)

	{
		int tot = 0;

		switch (operation) {
		case "add":

			tot = a + b;

			break;

		case "sub":

			tot = a - b;

			break;

		case "mul":

			tot = a * b;
			break;

		case "div":

			tot = a / b;

			break;

		case "mod":

			tot = a % b;

			break;

		default:

			System.out.println("not a valid operation");
			tot=-1;
			break;
		}
		
		
		return tot;

	}

}
