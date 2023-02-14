package com.dsa.searching;

import java.util.Scanner;

public class LinearSearch {
	
	
	public static int linearSearch(int[]ar,int element)
	{
		for(int i:ar)
		{
			if(element==i)
			{
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] array = new int[10];
		try (Scanner ob = new Scanner(System.in)) {
			System.out.println("Enter the array elements: ");
			for (int i = 0; i < array.length; i++) {
				array[i] = ob.nextInt();
			}

			for (int i : array)
				System.out.println(i);

			System.out.println("============Linear search implementation==========");
			System.out.println("enter the element to be searched in the array: ");
			int element = ob.nextInt();
			int result=linearSearch(array,element);
			
			if(result==1)
			{
				System.out.println("element "+element+" found in the array");
			}
			else
			{
				System.out.println("element "+ element +" not found in the array");
			}

		}

	}

}
