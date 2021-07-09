package core_java_project;

import java.util.Scanner;

public class PolindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String reverse = " ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(" reverse String is  " );
		System.out.println(reverse);
        

	}

}
