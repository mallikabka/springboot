package interviewPrgrms;

public class ArrayNumberPrinting {

	public static void main(String[] args) {
	int[] array= {20,30,40,50};
	printArray(array);

	}

	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			int num1=array[i]/10;
			int num=array[i]%10;
			System.out.println(num1+"  "+num);
		}
	}

}
