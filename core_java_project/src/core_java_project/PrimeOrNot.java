package core_java_project;

import java.util.Scanner;

//what is prime number:- who is prime number which is divided by 1 and itself.
public class PrimeOrNot {

	public static void main(String[] args) {
/*	int i,m=0,flag=0;
	int n = 8; //it is the number to be checked
	m=n/2;
	if(n==0||n==1) {
		System.out.println(n+ "is not prime number");
	} else {
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+ "is not prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+ "is prime number");
		}
	} */
	
	// take input to check prime or not
	Scanner sc = new Scanner(System.in);
	int i,m=0,flag=0;
	System.out.println("enter the number to check prime or not");
	int n = sc.nextInt(); 
	m=n/2;
	if(n==0||n==1) {
		System.out.println(n+ "  is not prime number");
	} else {
		for(i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+ "  is not prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+ " is prime number");
		}
	} 
	
	
	}

}
