package com.BasicPrograms.ext;

import java.util.Scanner;

public class LargestAmongThreeNumber {
	public static void main(String[] args) {
		int x ,y ,z ;
		Scanner number= new Scanner(System.in);
		System.out.println(" enter the three numbers  x , y , z :");
		 x=number.nextInt();
		 y=number.nextInt();
		 z=number.nextInt();
		 if (x > y  && x > z) {
			System.out.println(" x = "+x+ " is the largest value");
		} else if(y>x && y > z){
			System.out.println(" y = "+y+ " is the largest value");
		}else {
			System.out.println(" z = " +z+ " is the largest value");
		}
		
		//System.out.println("");
		
	}

}
