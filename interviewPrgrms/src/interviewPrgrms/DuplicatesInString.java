package interviewPrgrms;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str = "I am SoftwareEngineer";
		findDuplicatesInString(str);

	}

	public static void findDuplicatesInString(String str) {
		str.toLowerCase();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j] &&  charArray[i]!=' ') {

					charArray[j] = '0';
					count++;
				}
			}
			if (count > 1 && charArray[i] != '0') {
				System.out.println(charArray[i]+" - "+count+" times");
			}
		}
	}

}
