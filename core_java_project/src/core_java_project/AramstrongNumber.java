package core_java_project;

import java.util.Scanner;

public class AramstrongNumber {

	public static void main(String[] args) {
	/*int number=37,originalNumber,remaindar,result=0;
	originalNumber = number;
	while(originalNumber !=0) {
		remaindar = originalNumber % 10;
		result += Math.pow(remaindar, 3);
		originalNumber /=10;
	}
	if(result==number)
		System.out.println(number+ " is an Aramstrong number");
	else
		System.out.println(number+ " is not an Aramstrong number"); */
	
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to check aramstrong number");
	int number,originalNumber,remaindar,result=0;
	number = sc.nextInt();
	originalNumber = number;
	while(originalNumber !=0) {
		remaindar = originalNumber % 10;
		result += Math.pow(remaindar, 3);
		originalNumber /=10;
	}
	if(result==number)
		System.out.println(number+ " is an Aramstrong number");
	else
		System.out.println(number+ " is not an Aramstrong number");
	
	}

}
