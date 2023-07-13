package com.july13.QA;

import java.util.Arrays;

public class EqualityArray {
	
	public static void checkEquals(int[] a, int[] b) {
		boolean equal=true;
		Arrays.sort(a);Arrays.sort(b);
		if (a.length == b.length) {
			for (int index=0;index<a.length;index++)
			{
				if(a[index]!=b[index])
				{
					equal= false;
				}
				
			}
		}
		else
		{
		equal= false;
		}
		System.out.println(equal);
		if (equal)
		{
			System.out.println("Both arrays are equal: ");
		}
		else
		{
			System.out.println("Both arrays are not equal ");
		}
	}

	public static void main(String... args) {
		int[] array1 = new int[] { 2,5,1,7,4 };
		int[] array2 = new int[] { 2,4,1,7,5};
		// checkEquals(array1, array2);

		 
		 // Built in method: equals present in Arrays class
		 Arrays.sort(array1);Arrays.sort(array2);
		 boolean equalorNot=Arrays.equals(array1, array2);
		 if(equalorNot)
			 System.out.println("Both are equal ");
		 else
			 System.out.println("Both are not equal");
		
	}

}
