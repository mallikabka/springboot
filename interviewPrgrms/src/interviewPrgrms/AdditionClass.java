package interviewPrgrms;

import java.util.Scanner;

public class AdditionClass implements AdditionsInterface {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a numer");
		int num2 = sc.nextInt();
		AdditionClass obj = new AdditionClass();
		System.out.println(obj.add(num1, num2));
	}

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

}
