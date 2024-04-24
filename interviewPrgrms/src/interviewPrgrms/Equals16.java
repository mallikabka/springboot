package interviewPrgrms;

import java.util.Scanner;

public class Equals16 {

	public static void main(String[] args) {
		int[] arr = { 8, 9, 2, 3, 4, 6, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target sum :");
		int targetSum = sc.nextInt();
		findSum(arr, targetSum);

	}

	public static void findSum(int[] arr, int targetSum) {
		int index1 = 0;
		int index2 = 0;
		int sum = 0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				index1 = i;
				index2 = j;
				if (sum == targetSum) {
					System.out.println(index1 + " " + index2);
					found = true;
				}
			}

		}
		if (found == false) {
			System.out.println("Target Sum not found");
		}
	}

}
