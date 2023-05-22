package com.sumofcube;

import java.util.Scanner;

public class Cube {
	
	// creating digit separate and getting cube of each digit and adding all cubes
	
		int sumOfCube(int num) {

			int digit = 0 ;
			int cube;
			int sum = 0;

			while(num > 0) {
				
				digit=num % 10;  
				
				cube = digit * digit * digit;
				
				sum += cube;
				
				num=num/10;  
				
			}
			
			return(sum);
		}
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		Cube c = new Cube();
		
		System.out.println("Enter any digit number:");
		int num =  sn.nextInt();
		
		int sum = c.sumOfCube(num);
	}
	
	
}
