package interviewPrgrms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print fibonacci series :");
		int num=sc.nextInt();
		fibonacciSeries(num);
	}

	public static void fibonacciSeries(int num) {
		int f1=0;
		int f2=1;
		int f3 = 0;
		System.out.println("Fibonacci series is : ");
		System.out.print(f1+" "+f2);
		for(int i=1;i<num;i++) {
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
	}

}
