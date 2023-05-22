package com.java.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fiboNum1 = 0;
		int fiboNum2= 1;
		int fiboNum3 ;
		
		System.out.print("1 ");
		for(int i = 1; i <= num; i++ ) {
			
			fiboNum3  = fiboNum1 + fiboNum2;
			
			System.out.print(" "+fiboNum3);
			
			fiboNum1 = fiboNum2;
			fiboNum2 = fiboNum3;
			
		}
		 
		
	}
}
