package com.ojas.java8;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		System.out.println("Is Prime? : " + p.isPrime.test(num));

	}

	// check prime number using Predicate
	Predicate<Integer> isPrime = n -> {
		int count = 1;
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0)

				count++;

		}
		if (count == 1)

		{
			return true;
		} else
			return false;

	};

//printing 1 to 100 in java8
	public static void printPrime1To100(int num) {
		for (int i = 2; i <= num; i++) {
			int num1 = i;
			Boolean noneMatch = IntStream.range(2, i / 2 + 1).noneMatch(n -> num1 % n == 0);
			if (noneMatch)
				System.out.println(noneMatch + "    " + i);
		}

	}

}
