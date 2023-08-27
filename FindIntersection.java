package javaprogramstl;

import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {

		int[] a = { 3, 2, 11, 4, 6, 9 };

		int[] b = { 1, 2, 8, 4, 9, 7 };

		ArrayList<Integer> intersection = intersection(a, b);

		System.out.println(intersection);

	}

	public static ArrayList<Integer> intersection(int[] data1, int[] data2)

	{

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j < data2.length; j++)

			{

				if (data1[i] == data2[j]) {

					arr.add(data1[i]);

				}

			}

		}

		return arr;

	}

}
