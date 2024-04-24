package interviewPrgrms;

public class MinimumNumberArray {

	public static void main(String[] args) {
		int array[] = { 12, 34, 22, 3, 1, 45, 67, 20 };
		System.out.println("Minimum number in an array is : " + findMinimumNumber(array));

	}

	public static int findMinimumNumber(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

}
