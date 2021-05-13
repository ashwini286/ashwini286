package arraylist;

import java.util.Scanner;

public class TakeInputTwoDimensiolArrayInJava {
	public static void main(String args[]) {
		int row,column;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2D array size");
		  row = sc.nextInt();
		  column = sc.nextInt();
		  System.out.println("enter the element of array");  
		int[][] array=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			array[i][j]=sc.nextInt();
		}
		}
		System.out.println("array element are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
			System.out.println(array[i][j]);
		} 
	}
	}

