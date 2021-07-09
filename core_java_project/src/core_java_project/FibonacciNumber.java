package core_java_project;

import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
	/*	int a=0,b=1,i,count=7;
	System.out.println("Fibonacci series of " +count+ "number");
		for(i=1;i<=count;i++) {
			System.out.println(a+ " ");
			int sumOfprevTwo = a+b;
			a = b;
			b = sumOfprevTwo;
		} */ 
		int a=0,b=1,i,count;
		System.out.println("how may numbers you want in the sequense");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.println("Fibonacci series of " +count+ "number");
			for(i=1;i<=count;i++) {
				System.out.println(a+ " ");
				int sumOfprevTwo = a+b;
				a = b;
				b = sumOfprevTwo;
			}	
	}

}
