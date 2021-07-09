package core_java_project;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	/*	String s = "AshwiniSharma";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println("in reverse= " +sb.reverse());
		 */
		
		//with input using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name whatever u want to reverse");
		String s = sc.nextLine();
		String reverse = " ";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(" reverse String is  " );
		System.out.println(reverse);
	}

}
