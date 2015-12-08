package com.ashindigo.test;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	static Random rand = new Random();
	static Scanner scanner = new Scanner(System.in);
	private static int mode = -1;
	private static int cpumode;
	private static int wins;
	private static int cpuwins;
	private static boolean won;

	public static void main(String[] args) {

		run();
	}

	public static void run() {
		System.out.println("The score is " + wins + " : " + cpuwins);
		System.out.println("Choose your attack");
		System.out.println("0 = Rock");
		System.out.println("1 = Paper");
		System.out.println("2 = Scissors");
		mode = scanner.nextInt();
		cpumode = rand.nextInt(3);
		if (mode == 0 && cpumode == 2){
			System.out.println("You win!");
			wins++;
			won = true;
		}
		if (mode == 1 && cpumode == 0){
			System.out.println("You win!");
			wins++;
			won = true;
		}
		if (mode == 2 && cpumode == 1){
			System.out.println("You win!");
			wins++;
			won = true;
		}
		if (!won){
				System.out.println("You lose!");
				cpuwins++;
		}
		System.out.println("Play again?");
		System.out.println("0 = Yes");
		System.out.println("1 = No");
		int quit = -1;
		quit = scanner.nextInt();
		if (quit != 1) {
			won = false;
			run();
		} else {
			System.exit(0);
		}
	}
}