package com.ashindigo.test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class MiscToolsMain {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList alphabet = new ArrayList();
	static ArrayList keys = new ArrayList();

	public static void main(String[] args) {
		
		run();
	}

	public static void run() {
		
		System.out.println("Welcome to the Toolkit");
		System.out.println("Please select what you would like to do today");
		System.out.println("0 = String reverser");
		System.out.println("1 = Vowel Checker");
		System.out.println("2 = Encrypter");
		System.out.println("3 = CD Key Generator");
		System.out.println("4 = Quit");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: reverser(); break;
		case 1: vowelChecker(); break;
		case 2: encryption(); break;
		case 3: keyGenerator(); break;
		case 4: System.out.println("Goodbye!"); System.exit(0); break;
		}
		
	}

	private static void keyGenerator() {
		System.out.println("What would you like to do?");
		System.out.println("You have " + keys.size() + " key(s)");
		System.out.println("0 = New key");
		System.out.println("1 = View keys");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: break;
		case 1: System.out.println("Here are your key(s)"); System.out.println(keys); break;
		}
		System.out.println("Please enter the length of your key");
		int length = scanner.nextInt();
		Random rand = new Random();
		ArrayList array = new ArrayList();
		int runtime = 0;
		while (runtime  < length) {
			boolean rands = false;
			genertateAlphabet();
			rands = false;
			rands = rand.nextBoolean();
			if (rands == true) {
				runtime++;
		array.add(rand.nextInt(9));
		} else {
			array.add(alphabet.get(rand.nextInt(24)));
			runtime++;
			
		}
		}
		StringBuilder sb = new StringBuilder(array.toString());
		String strings = new String(array.toString());
		String word1 = strings.replace('[', '\0');
		String strings1 = new String(word1);
		String word2 = strings1.replace(']', '\0');
		String strings2 = new String(word2);
		String word3 = strings2.replace(' ', '\0');
		String strings3 = new String(word3);
		String word = strings3.replace(',', '\0');
		System.out.println("Here is your key");
		System.out.println(word);
		keys.add(word);
		System.out.println("Continue?");
		System.out.println("0 = Continue");
		System.out.println("1 = Return to main menu");
		int mode2 = scanner.nextInt();
		switch (mode2) {
		case 0: keyGenerator(); break;
		case 1: run(); break;
		}
	}

	private static void encryption() {
		System.out.println("Welcome to the encrypter");
		System.out.println("Please enter a word");
		String word = scanner.nextLine();
		word.replace('a', 'e');
		
	}

	// Method to check the amount of vowels in a word
	private static void vowelChecker() {
		System.out.println("Welcome please enter a valid word");
		String word = scanner.next();
		int runtime = 0;
		int vowel = 0;
		while (runtime < word.length()) {
			if (word.charAt(runtime) == 'a') {
				vowel++;
			} 
			if (word.charAt(runtime) == 'e') {
				vowel++;
				}
			if (word.charAt(runtime) == 'i') {
				vowel++;
				}
			if (word.charAt(runtime) == 'o') {
				vowel++;
				}
			if (word.charAt(runtime) == 'u') {
				vowel++;
				}
			// And sometimes y
			if (word.charAt(runtime) == 'y') {
				vowel++;
				}
			runtime++;
		}
		if (vowel != 0 && vowel != 1) {
		System.out.println("There are " + vowel + " " + "vowels in this word");
		} else if (vowel == 1){
			System.out.println("There is one vowel in this word!");
		} else {
			System.out.println("There are no vowels in this word!");
		}
		System.out.println("Continue?");
		System.out.println("0 = Continue");
		System.out.println("1 = Return to main menu");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: vowelChecker(); break;
		case 1: run(); break;
		}
	}

	// Reverses a word
	private static void reverser() {
		
		System.out.println("Please enter a string");
		String word = scanner.next();
		String word2 = new StringBuilder(word).reverse().toString();
		System.out.println("Here is your reversed word");
		System.out.println(word2);
		System.out.println("Would you like to continue?");
		System.out.println("0 = Continue");
		System.out.println("1 = Return to main menu.");
		int mode = scanner.nextInt();
		switch (mode) {
		case 0: reverser(); break;
		case 1: run(); break;
		}
	}
	
	// I am not sorry for this
		private static void genertateAlphabet() {
			alphabet.add("a");
			alphabet.add("b");
			alphabet.add("c");
			alphabet.add("d");
			alphabet.add("e");
			alphabet.add("f");
			alphabet.add("g");
			alphabet.add("h");
			alphabet.add("i");
			alphabet.add("j");
			alphabet.add("k");
			alphabet.add("l");
			alphabet.add("m");
			alphabet.add("o");
			alphabet.add("p");
			alphabet.add("q");
			alphabet.add("r");
			alphabet.add("s");
			alphabet.add("t");
			alphabet.add("u");
			alphabet.add("w");
			alphabet.add("x");
			alphabet.add("y");
			alphabet.add("z");
		}

}
