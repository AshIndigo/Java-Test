package com.ashindigo.test;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class MadLibGenerator {
	
	// Vars for the story
	static Scanner scanner = new Scanner(System.in);
	static String name;
	private static String verb1;

	public static void main(String[] args) {
		
		run();
	}

	public static void run() {
		
		// Main menu for the program
		int mode = -1;
		System.out.println("Welcome, Please select an option.");
		System.out.println("0 = Make a madlib");
		System.out.println("1 = Quit");
		mode = scanner.nextInt();
		if (mode < 2){
		switch (mode) {
		case 0: generate();
		case 1: System.exit(0);
		} 
		} else {
			System.out.println("Invalid mode");
			run();
		}
		
	}

	private static void generate() {
		
		// Asks for the names and words
		System.out.println("Your name");
		name = scanner.next();
		System.out.println("Verb 1");
		verb1 = scanner.next();
		System.out.println("One day " + name + " was walking down a street and then he " + verb1 + ".");
		try {
			System.out.println("Press any key to continue");
			System.in.read();
			run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
