package com.ashindigo.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMain {
	
	static ArrayList main = new ArrayList();
	static int length = main.size();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		run();
	}

	public static void run() {
		
		// Main screen with the options for the user.
		length = main.size();
		System.out.println("You have " + length + " item(s) in your list");
		System.out.println("What would you like to do?");
		System.out.println("Add an item = 0");
		System.out.println("Delete an item = 1");
		System.out.println("View the list = 2");
		System.out.println("Exit = 3");
		int result = scanner.nextInt();
		// Switch statement to launch the different options
		switch (result){
		case 0: addItem(); break;
		case 1: deleteItem(); break;
		case 2: viewList(); break;
		case 3: exit(); break;
		}
	}

	// Method to add items to the list
	private static void addItem() {
		System.out.println("Please enter text");
		main.add(scanner.next());
		System.out.println("Press any key to continue");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		run();	
	}

	// Method to remove items from the list
	private static void deleteItem() {
		System.out.println("Please enter the number of the object to delete");
		main.remove(scanner.nextInt() - 1);
		length = main.size();
		System.out.println("Press any key to continue");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		run();
	}
	
	// Method to view the list
	private static void viewList() {
		int runtime = 0;
		if(main.size() != 0){
		while(runtime < length){
			System.out.println(runtime + 1 + ". " + main.get(runtime));
			runtime++;
		}
		} else {
			System.out.println("There is nothing to list");
		}
		System.out.println("Press any key to continue");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		run();
	}
	
	// Exits the program
	private static void exit() {
		
		System.out.println("Goodbye!");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0);
		
	}
}
