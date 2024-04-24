package interviewPrgrms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (isPrimeNumber(num)) {
			System.out.println(num + " Given number is Prime Number");
		} else {
			System.out.println(num + " Given number is not a prime number");
		}

	}

	public static boolean isPrimeNumber(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;

	}

}
