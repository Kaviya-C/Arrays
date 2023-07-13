package com.july13.QA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// we can find the duplicate element in array by 4 ways
// brute force method
// sorting method
// hash set
// hash map
public class DuplicateArray 
{
	public static void findDup(int[] a)
	{
		Set<Integer> unique=new HashSet<>();
		Set<Integer> duplicate=new HashSet<>();
		
		duplicate=Arrays.stream(a).filter(element->!unique.add(element)).boxed().collect(Collectors.toSet());
		System.out.println(duplicate);
	}
		public static void main(String...args)
		{
			int[] array= new int[]{18,90,78,43,45,6,6,78,90};
			
			findDup(array);
			//System.out.println(Arrays.toString(duplicate));
		}
}
