package com.ojas.functionalinterfaceex;

public class Calculator implements Operations,FunctionalInt {
	public static void main(String[] args) {
		Calculator op=new Calculator();
		int multiplication_result = op.multiplication(2, 4);
		System.out.println( multiplication_result);
		Operations.print();
		FunctionalInt.print();
	
	}
	
	

	@Override
	public int addition(int a, int b) {
		
		return 0;
	}

	@Override
	public int substraction(int a, int b) {
		
		return 0;
	}



	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}



	
	

}
