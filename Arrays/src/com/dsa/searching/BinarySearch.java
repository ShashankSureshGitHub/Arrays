package com.dsa.searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int i : array) {
			System.out.print(i);
			System.out.println();
		}
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter for the number to be searched in the array:");
			int num = sc.nextInt();
			int low = 0;
			int high = array.length - 1;
			int result = binarySearch(array, num, low, high);
			if (result == -1) {
				System.out.println("Enter a valid element/ Element not found");
			} else {
				System.out.println("Element " + num + " found in the array at the position " + (result + 1));
			}
		}

	}

	public static int binarySearch(int[] array, int num, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == num) {
				return mid;
			} else if (array[mid] > num) {
				return binarySearch(array, num, low, mid - 1);
			} else {
				return binarySearch(array, num, mid + 1, high);
			}
		}

		return -1;
	}
}