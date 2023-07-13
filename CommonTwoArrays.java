package com.july13.QA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonTwoArrays 
{
	public static void main(String...args)
	{
		int[] a= {1,2,5,9,6,7};
		int[] b= {6,8,9,5,10};
		Set<Integer> set=new HashSet<>();
		
		for(int element: a)
		{
			for(int second:b)
			{
				if(element==second)
				{
					set.add(element);
				}
			}
		}
		System.out.println("Common Elements: "+set);
	
	//---------------------------------------------	
		
		String[] s1= {"kavi","geetha","seetha","ram"};
		String[] s2= {"ram","yalini","iniya","seetha"};
		
		Set<String> set1=new HashSet<>();
	   for(String first:s1)
	   {
		   for(String second: s2)
		   {
			   if(first.equals(second))
			   {
				 set1.add(first);
			   }
		   }
	   }
	   System.out.println("Common String elements btw two arrays: : \n"+set1);
		
	  Integer[] a1= {1,2,5,9,6,7};
		Integer[] b1= {6,8,9,5,10};
	   
	   Set<Integer> s3=new HashSet<>(Arrays.asList(a1));
	   Set<Integer> s4=new HashSet<>(Arrays.asList(b1));
	   
	   s3.retainAll(s4);
	   System.out.println("retain all method :\nCommon elements are: "+s3);
	}
}
