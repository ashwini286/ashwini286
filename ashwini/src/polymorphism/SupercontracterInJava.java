package polymorphism;

public class SupercontracterInJava {
	public SupercontracterInJava (){
		this(2);
		System.out.println("default");
	}
	SupercontracterInJava (int a,float b){
		System.out.println("parameterized constructer");
	}
	SupercontracterInJava (int a){
		System.out.println("parameterized constructor 2");
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc ab = new Abc();

	}
}
	class Abc extends SupercontracterInJava {
		Abc(){
			super(34);
			System.out.println("ash");
		}

}
	
