package com.ashindigo.test;

import java.util.Scanner;

public class ConverterMain {
	
	static Scanner scanner = new Scanner(System.in);
	static int mode1 = -1;

	public static void main(String[] args) {
		
		run();
	}

	// This class is useless
	public static void run() {
		System.out.println("Hello and welcome to the Converter.");
		System.out.println("What would you like to do today?");
		mode1 = scanner.nextInt();
		switch (mode1) {
		case 0: Int(); break;
		case 1: Integer(); break;
		case 2: Double(); break;
		case 3: Long(); break;
		case 4: Float(); break;
		}
		
	}

	private static void Float() {
		System.out.println("Would you like to change from Float to String or vice versa?");
		System.out.println("0 = Float to String");
		System.out.println("1 = String to Float");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: floatToString();
		case 1: stringToFloat();
		}	
	}

	private static void Integer() {
		System.out.println("Would you like to change from Integer to String or vice versa?");
		System.out.println("0 = Integer to String");
		System.out.println("1 = String to Integer");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: integerToString();
		case 1: stringToInteger();
		}
	}

	private static void Long() {
		System.out.println("Would you like to change from Long to String or vice versa?");
		System.out.println("0 = Long to String");
		System.out.println("1 = String to Long");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: longToString();
		case 1: stringToLong();
		}	
	}

	private static void Double() {
		System.out.println("Would you like to change from Double to String or vice versa?");
		System.out.println("0 = Double to String");
		System.out.println("1 = String to Double");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: doubleToString();
		case 1: stringToDouble();
		}
	}

	private static void Int() {
		
		System.out.println("Would you like to change from int to String or vice versa?");
		System.out.println("0 = int to String");
		System.out.println("1 = String to int");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: intToString();
		case 1: stringToInt();
		}
	}

	private static void stringToDouble() {
		// TODO Auto-generated method stub
		
	}

	private static void doubleToString() {
		// TODO Auto-generated method stub
		
	}

	private static void stringToLong() {
		// TODO Auto-generated method stub
		
	}

	private static void longToString() {
		// TODO Auto-generated method stub
		
	}

	private static void stringToInteger() {
		// TODO Auto-generated method stub
		
	}

	private static void integerToString() {
		// TODO Auto-generated method stub
		
	}

	private static void stringToInt() {
		// TODO Auto-generated method stub
		
	}

	private static void intToString() {
		// TODO Auto-generated method stub
		
	}
	
	private static void stringToFloat() {
		// TODO Auto-generated method stub
		
	}

	private static void floatToString() {
		System.out.println("Please enter a Float");
		float floats = scanner.nextFloat();
		System.out.println(floats);
	}
}
