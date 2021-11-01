package com.BasicPrograms.ext;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner check_year =new Scanner(System.in);
		System.out.println("Enter the year :");
	    int year=check_year.nextInt();
	if (year<9999) {
		 int leap_year=year%4;
			if (leap_year==0) {
				System.out.println (year+" is leap year");
			} else {
				System.out.println(year+"  is not leap year");
			}  
	}else {
        	System.out.println("user provided invalid data");
        }
		
		//System.out.println(year_1);
	}

}

