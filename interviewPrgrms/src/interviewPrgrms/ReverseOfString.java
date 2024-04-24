package interviewPrgrms;

public class ReverseOfString {

	public static void main(String[] args) {
		String str = "mallika";
		System.out.println("Reverse string is : " + reverseString(str));

	}

	public static String reverseString(String str) {
		char[] charArray = str.toCharArray();
		String reversedString = " ";
		for (int i = charArray.length-1; i >=0; i--) {
			char charAt = str.charAt(i);
			reversedString += charAt;
		}
		return reversedString;

	}

}
