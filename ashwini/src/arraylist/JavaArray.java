package arraylist;

import java.util.Arrays;

public class JavaArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=10; //declaration of array size
		int arrayName[]=new int[s]; //here new is a keyword used to allcoate memory
		//and size is length of array.
		arrayName[0]=10; //initialization of index
				arrayName[2]=30;
						arrayName[4]=50;
								arrayName[6]=60;
										arrayName[7]=90;
// when print the value of index value such like :-										
			System.out.println("array element  value : "+arrayName[2]);	
//when the print the no of every index with value of every index value	both :-												
for(int c=0;c<arrayName.length;c++) {
System.out.println("no of array indax  :" +c+  "  value of no of array="+arrayName[c]);	
}
//when print the length of array :-
System.out.println("length of string "+arrayName.length);
//when print the every value without index such like:-	
	System.out.println("without indax  : " +Arrays.toString(arrayName));
}
}
