package com.july13.QA;

import java.util.Arrays;
public class MoveZerosToFirst 
{
	public static void moveZerosToFirst(int[] array)
	{
		int counter=array.length-1;
		
		for(int index=array.length-1;index>=0;index--)
		{
			if(array[index]!=0)
			{
				array[counter]=array[index];
				counter--;
			}
		}
		while(counter>=0)
		{
			array[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String...args)
	{
		moveZerosToFirst(new int[] {0,1,0,0,3});
	}

}
