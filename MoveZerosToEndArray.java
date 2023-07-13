package com.july13.QA;

import java.util.Arrays;

public class MoveZerosToEndArray
{
	public static void  moveZerosToEnd(int[] array)
	{
		int counter=0;
		
		for(int index=0;index<array.length;index++)
		{
			//
			if(array[index]!=0)
			{
				array[counter]=array[index];//0==1 
				counter++;//1
			}
		}
			while(counter<array.length)
			{
				array[counter]=0;
				counter++;
			}
		
		System.out.println("Finally: "+Arrays.toString(array));
		
		
	}
	public static void main(String...args)
	{
		moveZerosToEnd(new int[] {1,2,7,0,3,4,0,0,5,0,9});
	}

}
