package interviewPrgrms;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		String name = "mallika";
		System.out.println("Length of the string is : " + findLength(name));

	}

	public static int findLength(String name) {
		int lengthOfString = 0;
		char[] charArray = name.toCharArray();
		for (int ch : charArray) {
			lengthOfString++;
		}
		return lengthOfString;
		

	}

}
