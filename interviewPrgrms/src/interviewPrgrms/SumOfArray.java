package interviewPrgrms;

public class SumOfArray {

	public static void main(String[] args) {
		int array[] = { 1, 8, 2, 5, 2, 9, 7 };
		System.out.println("Sum Of Array is : " + findSumOfArray(array));

	}

	public static int findSumOfArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;

	}

}
