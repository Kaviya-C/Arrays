package com.july13.QA;

import java.util.Arrays;

public class ContinousSubArrayEqualGivenSum 
{
	public static void findSubArray(int[] a,int givenNumber)
	{
		int total=a[0];
		
		int count=0;
		
		for(int index=1;index<a.length;index++)
		{
			total+=a[index];
			
			if(total>givenNumber && count<=index-1)
			{
				total=total-a[count];
				count++;
			}
			if(total==givenNumber)
			{
				for(int last=count;last<=index;last++)
				{
					System.out.print(a[last]+"  ");
				}
			}
		}
		
		
	}

public static void main(String... args) 
{
		int[] array = new int[] { 2,3,4,5,6,7};
		int total = 12;
		findSubArray(array, total);
	}

}
