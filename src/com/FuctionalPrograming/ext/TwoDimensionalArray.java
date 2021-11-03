package com.FuctionalPrograming.ext;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the row :");
		int row= value.nextInt();
		System.out.println("Enter the column :");
		int column= value.nextInt();
		int[][]twoarray =new int [row][column];
	    for (int i = 0; i < twoarray.length; i++) 
	    {
			for (int j = 0; j < twoarray[i].length; j++) 
			{
				System.out.println("enter the value of " +i+"   "+ j+ " : ");
				twoarray[i][j]=value.nextInt();
				System.out.print("  ");	
			}
			System.out.println("  ");
		}
	    for (int i = 0; i < twoarray.length; i++) {
	    	for (int j = 0; j < twoarray[i].length; j++) {
	    		System.out.print(twoarray[i][j]+" ");
				
			}
	    	System.out.println(" ");
		}
		
		
		
		
	}

}
