package interviewPrgrms;

public class SecondMaximumNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 1, 4, 3, 8, 9, 60, 4, 23,50 };
		System.out.println("Second Maximum Number : " + findSecondMaxNumber(arr));
	}

	public static int findSecondMaxNumber(int[] arr) {
		int maxNum = Integer.MIN_VALUE;
		int secMaxNum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				secMaxNum = maxNum;
				maxNum = arr[i];
			} else if (arr[i] > secMaxNum && arr[i] != maxNum) {
				secMaxNum = arr[i];
			}
		}
		return secMaxNum;

	}

}
