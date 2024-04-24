package interviewPrgrms;

public class MaximumArray {

	public static void main(String[] args) {
		int array[] = { 12, 34, 22, 3, 1, 45, 67, 20 };
		System.out.println("Maximum number in an array is : " + findMaximumNumber(array));

	}

	public static int findMaximumNumber(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;

	}

}
