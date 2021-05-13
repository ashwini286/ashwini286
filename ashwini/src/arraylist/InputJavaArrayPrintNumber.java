package arraylist;
import java.util.*;

public class InputJavaArrayPrintNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz the lenght of array");
		 int length = sc.nextInt();
		int[] array=new int[length];
		System.out.println("enter the element of array");
		for(int i=0;i<length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("array element are");
		for(int i=0;i<length;i++) {
			System.out.println(array[i]);
		}
	}
	}
