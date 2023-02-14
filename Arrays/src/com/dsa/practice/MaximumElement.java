package com.dsa.practice;

import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}
			int largest = 0;
			System.out.println(Maximum(array, array.length, 0, largest));
		}
	}

	public static int Maximum(int[] arr, int size, int i, int largest) {

		if (i == size)
			return largest;
		if (arr[i] > largest) {
			largest = arr[i];
		}
		 return Maximum(arr, size, ++i, largest);

	}

}

/*  public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int ans = maxelement(arr,0);
        System.out.println(ans);
    }

    public static int maxelement(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        
        int max = maxelement(arr,idx+1);
        if(max < arr[idx]){
            max = arr[idx];
        }
        return max;
    }
    */
