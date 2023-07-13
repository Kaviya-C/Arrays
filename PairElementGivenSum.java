package com.july13.QA;

import java.util.Arrays;

public class PairElementGivenSum {
	public static void findAllPairs(int[] array, int total) {
		Arrays.sort(array);

		// 5,5,6,6,8

		int start = 0;
		int last = array.length - 1;
		while (start < last) {
			if (array[start] + array[last] == total) 
			{
				System.out.println(array[start] + " + " + array[last] + " = " + total);
				start++;
				last--;

			} else if (array[start] + array[last] > total) {
				last--;
			} else if (array[start] + array[last] < total) {
				start++;
			}

		}

	}

	public static void main(String... args) {
		int[] array = new int[] { 8, 5, 6, 6, 5 };

		int sum = 11;

		findAllPairs(array, sum);

	}

}
