package com.ojas.functionalinterfaceex;

@FunctionalInterface
public interface FunctionalInt {
	public static  void print() {
		System.out.println("This is static method from Functional Interface");
	}
	public void call();

	

}
