package core_java_project;

//import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	/*	int r,n,s=0;
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
         while(n!=0) {
        	r=n%10;
        	s=s*10+r;
        	n=n/10;
         }
         System.out.println(s); */
	 
		int r,s=0,n=32;
		while(n!=0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		
		System.out.println(s);
	}

}
