package wapperclassDemo;

public class WapperClassInJava {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//Java program to convert object into primitives  
//Unboxing example of Integer to int   
//Converting Integer to int    
/*Integer a=new Integer(3);    
int i=a.intValue();//converting Integer to int explicitly  
int j=a;//unboxing, now compiler will write a.intValue() internally   
System.out.println(a+" "+i+" "+j);  */  
/*String a = new String("12");
String b = new String("12");
int sum = Integer.parseInt(a)+Integer.parseInt(a);
System.out.println(sum); */
		// ****************
Float a = new Float(12.3f);
Float b = new Float(23.5f);
int s = Integer.parseDouble(a)+Integer.parseInt(b);
System.out.println(s);


	}

}
