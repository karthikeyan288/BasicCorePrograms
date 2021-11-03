package com.FuctionalPrograming.ext;

import java.util.Scanner;

public class DistanceProblem {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x=value.nextInt();
		System.out.println("Enter the value of y: ");
		int y=value.nextInt();
		double distance = Math.sqrt(x*x + y*y);
		 
  
        System.out.println("The ("+x+ ","+y+ ") is " +distance+" from the origin (0 ,0)");
		
		
		System.out.println("");
		
	}

}
