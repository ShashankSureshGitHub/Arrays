package com.dsa.practice;

import java.util.Scanner;

public class PatternRecursion {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			Pattern(num);
		}

	}

	public static void Pattern(int n) {

		if (n == 1) {
			for (int i = 1; i <= 3; i++) {
				System.out.print(n);
			}
			return;
		}
		for (int i = 1; i <= 3; i++) {
			System.out.print(n);
			if(i<3)
			{
			Pattern(n - 1);
			}
		}

	}
	
	/* public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printpattern(n-1);
        System.out.print(n + " ");
        printpattern(n-1);
        System.out.print(n + " ");
    }
    */

}
