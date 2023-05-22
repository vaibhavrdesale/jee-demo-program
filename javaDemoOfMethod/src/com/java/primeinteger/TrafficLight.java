package com.java.primeinteger;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Traffic Light color:(green,red,yellow)");
		String color = sc.next();
		
		if(color.equals("green")) {
			System.out.println("go");
		}
		else if(color.equals("red")) {
			System.out.println("stop");
		}
		else if(color.equals("yellow")) {
			System.out.println("ready");
		}
	}
}