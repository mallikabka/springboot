package interviewPrgrms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if(isPalindrome(number)) {
			System.out.println(number + " is Palindrome Number");
		}else {
			System.out.println(number + " is not a Palindrome Number");
		}

	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int reminder = 0;
		int num = number;
		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10+reminder;
			number = number / 10;

		}
		if(num==reverse) {
			
			return true;
		}
		return false;
	}

}
