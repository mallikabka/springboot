package interviewPrgrms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		findEvenorOdd(number);
		EvenOrOdd obj=new EvenOrOdd();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}

	public static void findEvenorOdd(int number) {
	if(number%2==0) {
		System.out.println("Given number is Even");
	}else {
		System.out.println("Gven number is Odd");
	}
		
	}

}
