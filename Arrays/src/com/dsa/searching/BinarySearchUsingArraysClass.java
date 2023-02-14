package com.dsa.searching;

import java.util.Arrays;

public class BinarySearchUsingArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {10,30,40,20,50};
		int key=20;
		Arrays.sort(array);// sorts the array in ascending order
		System.out.println("Key "+key+" found at the position "+(Arrays.binarySearch(array, key)+1));
	}

}
