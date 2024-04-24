package interviewPrgrms;

public class SwapNumbersWithoutThirdVar {

	public static void main(String[] args) {
		int num1=100;
		int num2=200;
		swapNumbers(num1,num2);

	}

	public static void swapNumbers(int num1, int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+" "+num2);
		
	}

}
