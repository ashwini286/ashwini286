package cloneObj;
//single inharitance//
public class Inharitance {
	int s;
	public void add(int a,int b) {
   int   s=a+b;
	   System.out.println("sum= "+s);
	}
}
  class Subtraction extends Inharitance{
	   void sub(int a,int b) {
	    s=a-b;
		   System.out.println("Sub total= "+s);
	   }
	public static void main(String[] args) {
		int a=50,b=60;
		Subtraction obj2=new Subtraction();
		obj2.sub(a,b);
		obj2.add(a, b);

	}

}
