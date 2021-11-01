package com.BasicPrograms.ext;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner number_check=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = number_check.nextInt();
		if (number%2==0) {
			System.out.println("The " +number+ "  is an even number" );
		} else {
            System.out.println("The " +number+ " is an odd number ");   
		}
		
	}

}
