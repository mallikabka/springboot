package com.ojas.functionalinterfaceex;

public interface Operations {

	default int multiplication(int a, int b) {

		return a * b;

	}
	
	public static void print() {
		System.out.println("STatic method");
	}

	public int addition(int a, int b);

	public int substraction(int a, int b);
	

}
