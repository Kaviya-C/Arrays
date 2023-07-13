package com.july13.QA;
import java.util.Arrays;
public class SecondLargestArray 
{
	public static int secondLargerElement(int[] a)
	{ 
		int first=0;int second=0;
		if(a[0]>a[1])
		{
			first=a[0];
			second=a[1];
		}
		else
		{
			first=a[1];
			second=a[0];
		}
		for(int start=2;start<a.length;start++)
		{
			if(a[start]>first)
			{
				second=first;
				first=a[start];
			}
			else if(a[start]<first && second>a[start])
			{
				second=a[start];
			}
		}
		return second;
		
		
		
		
	}
	public static void main(String...args)
	{
		int[] array=new int[] {100,90,32,156,231,311};
		
		int secondLarge=secondLargerElement(array);
		
		System.out.println("Second largest element: "+(secondLarge));
		
	}

}
