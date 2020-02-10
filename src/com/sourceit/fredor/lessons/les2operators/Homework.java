package com.sourceit.fredor.lessons.les2operators;

import java.util.Scanner;

/*This code was created under "homework - operators" requirements. 
 * Note: Some requirements described in N.B. block were ignored to reduce qty of files:)
 * 
 */

public class Homework {

	static Scanner sc = new Scanner(System.in);
	//Following two fields are used for sumConsoleNums() method
	private static int num1=0;
	private static float num2=0;

	public static void calcTriangleArea() {

		
		// Following structures are used to reduce duplication of code 
		char[] sideNames = { 'A', 'B', 'C' };
		double[] sideValues = new double[sideNames.length];

		
		for (int i = 0; i < sideNames.length; i++) {
			System.out.println("Enter " + sideNames[i] + " value:");
			sideValues[i] = sc.nextDouble();
		}

		System.out.println("Area of triangle is: " + applyHeronsFormula(sideValues));

	}

	// This method can be used internally (to be called in calcTriangleArea() method) or
	// externally
	public static double applyHeronsFormula(double[] sides) {

		double p = 0;
		
		for (int i = 0; i < sides.length; i++) {
			p += sides[i];
		}
		
		p = p / 2;

		return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
	}
	
	public static void calcCircumference() {

		System.out.println("Enter Radius:");
		double r = sc.nextDouble();
		System.out.println("Circumference is: " + 2*Math.PI*r); 
	}
	
	public static void sumConsoleNums() {
		//System.out.println(sc.hasNextDouble());
		System.out.println("Enter 1st number:");
		String s;
				
		do {			
			s=sc.next();
		} while (!isNumber(s));
		
		isInteger(s);
		System.out.println("Enter 2nd number:");
		do {			
			s=sc.next();
		} while (!isNumber(s));
		
		isInteger(s);
		
		if (num2==0) System.out.println("Result: " + num1);			
	    else System.out.println("Result: " + (num1+num2));
				
		
	}
	
	public static boolean isNumber(String str) {
		
		try {
			Float.parseFloat(str);		
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Entered values is not a number. Enter value again:");
			return false;
		}		
	}
	
	public static boolean isInteger(String str) {
		
		try {
			num1=num1+Integer.parseInt(str);			
			System.out.println("Entered value is an integer");
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Entered value is a float");
			num2=num2+Float.parseFloat(str);
			return false;
		}		
	}
	
}
