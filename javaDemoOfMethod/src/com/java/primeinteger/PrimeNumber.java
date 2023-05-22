package com.java.primeinteger;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count;

		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {

					count++;

				}
				
			}
			if(count == 2) {
				System.out.println(i);
			}
		}


	}

}
