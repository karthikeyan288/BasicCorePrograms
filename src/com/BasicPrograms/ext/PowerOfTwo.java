package com.BasicPrograms.ext;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		Scanner number= new Scanner(System.in);
		System.out.println(" Enter the  numbers  x  :");
		int value=number.nextInt();
			for (int i = 0; i*2 <= value; i++) {
				int x=2*i;
				System.out.println("2 * " +i+ " = "+x);
				}
			
	}
}			
			
		
		
		
	


