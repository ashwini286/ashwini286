package core_java_project;
//title:- create string and how to use some important methods of string class.
public class StringClassMethod {

	public static void main(String[] args) {
		//create string in 3 ways
		//first
		String a = "my name is ashwini";
		//second
		String b = new String("i like it");
		//third
		char arr[] = {'a','s','h','w','i','n','i','s','h','a','r','m','a'};
		String c = new String(arr);
		
		//display all 3 string
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//find length 
		System.out.println("length of a= " +a.length());
		
		//concatenate two string
		System.out.println("a and b joined= " +a.concat(b));
		
		
		//concatenate three string with +
		System.out.println(a+ "from" +c);
		
		//test if string a starts with a
		boolean x = a.startsWith("m");
		if(x) System.out.println("a starts with \'a\' ");
		else System.out.println("a does not start with \'a\' ");
		
		//convert a into uppercase and lowercase
		System.out.println("Upper a= " +a.toUpperCase());
		System.out.println("lower b= " +a.toLowerCase());

	}

}
