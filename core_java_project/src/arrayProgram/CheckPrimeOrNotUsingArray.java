package arrayProgram;

import java.util.Scanner;

public class CheckPrimeOrNotUsingArray {

	public static void main(String[] args) {
		int i,m=0,flag=0;
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check prime or not");
		for( i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}	
			for( i=2;i<i;i++) {
				if(arr[i]%i==0) {
					flag=1;
					break;
				}
			}
		
			if(flag = 0) {
				System.out.println(i+" number is prime");
			}
			}

}