package com.ashindigo.test;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Detects classes in com.ashindigo.test package and allows the invoking of the main method
 * @author Ash Indigo
 *
 */
public class ProgLauncher {
	
	public static Scanner scanner = new Scanner(System.in);
	public static File thisFile = new File("bin/com/ashindigo/test/ProgLauncher.class");
	
	public static void main(String[] args) {
		
		run();
	}

	public static void run() {
		int runtime = 0;
		System.out.println("List of Java Programs in Dir");
		thisFile = thisFile.getAbsoluteFile();
		thisFile = thisFile.getParentFile();
		while (runtime < thisFile.list().length) {
			System.out.println(runtime + ": " + thisFile.list()[runtime]);
			runtime++;
		}
		System.out.println("Please enter the number of the program you would like to load");
		int numb = scanner.nextInt();
		try {
			String[] params = null;
			Method method = ClassLoader.getSystemClassLoader().loadClass("com.ashindigo.test." + thisFile.list()[numb].replace(".class", "")).getMethod("main", String[].class);
			method.invoke(method, (Object) params);
			// So many catch blocks
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
}
