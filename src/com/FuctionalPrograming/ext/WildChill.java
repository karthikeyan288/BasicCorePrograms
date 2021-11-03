package com.FuctionalPrograming.ext;

import java.util.Scanner;

public class WildChill {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the temperature : ");
		double t=value.nextDouble();
		System.out.println("Enter the wind speed :");
		double v=value.nextDouble( );
		if ((t<50)&&(v>3)&& (v<120)){
			 double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
			 System.out.println("The wind chill was :  "+w);
		} else {
			 System.out.println(" irrelavant data, please provide correct data");
            
		}
		
		
		
		
		System.out.println("");
		
	}

}
