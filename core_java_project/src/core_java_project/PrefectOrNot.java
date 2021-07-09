package core_java_project;

import java.util.Scanner;

public class PrefectOrNot {

	public static void main(String[] args) {
	/*	int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check perfect or not");
		 num = sc.nextInt();
		if(num>0) {
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			if(sum==num) {
				System.out.println(num+"  is perfect number");
			}else {
				System.out.println(num+ "  is not perfect number");
			}
		} */  
		
		
		
	// check perfect without input	
		int num,sum=0;
		 num = 12;
		if(num>0) {
			for(int i=1;i<num;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			if(sum==num) {
				System.out.println(num+"  is perfect number");
			}else {
				System.out.println(num+ "  is not perfect number");
			}
		}
		
	}
}
