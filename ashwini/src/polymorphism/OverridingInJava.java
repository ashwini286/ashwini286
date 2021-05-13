package polymorphism;

public class OverridingInJava {  //difference class
	 Object sum(int a,float d) {  // Method & augment both are same both class
		 System.out.println("minmin");
		 return 0;
	 }

}
 class Abc extends OverridingInJava {  //difference class
	 int sum(int a,float b) {
		 System.out.println("i love u");
		 return 0;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingInJava as = new OverridingInJava();
		as.sum(10, 20.4f);
		Abc ash = new Abc();
		ash.sum(10, 21.5f);
		

	}

}
