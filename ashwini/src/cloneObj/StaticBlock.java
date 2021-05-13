package cloneObj;

public class StaticBlock {
	static int a;  //static variable
	static String b;  //static variable
	static {       //static block
	    a=10;
	    b="anup sir";
	}

	public static void main(String[] args) {
		System.out.println("value of a= "+a);
		System.out.println("java teacher name= "+b);
	

}
}
