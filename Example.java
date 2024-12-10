package gf.multithreading;

import java.util.Scanner;

public class Example {
	
	static void m1() {
		System.out.println("m1() method exceute");
	}
	static void m2() {
		System.out.println("m2() method exceute");
		System.out.println("Enter Data :: ");
		Scanner scn = new Scanner(System.in);
		String data = scn.nextLine();
		System.out.println("Data :: "+ data);
	}
	static void m3() {
		System.out.println("m3() method exceute");
	}

	public static void main(String[] args) {
		m1();
		m2();
		m3();

	}

}
