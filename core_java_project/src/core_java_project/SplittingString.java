package core_java_project;

public class SplittingString {

	public static void main(String[] args) {
		String str = "Hello, this is a book in java";
		 //declare a string type array s to strong pieces
		String s[ ];
		
		//split the string where a space if found in str
		s = str.split(" ");
		 
		//display the pieces from s
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}

}
