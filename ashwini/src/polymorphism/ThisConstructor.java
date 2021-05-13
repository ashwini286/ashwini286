package polymorphism;

public class ThisConstructor {

	public int c;
	float d;


/*	ThisConstructor(int a,float b){
		this.c=a;
		this.d=b;
		System.out.println("elephant");
	} */
	public ThisConstructor (){
		this(2);
		System.out.println("default");
	}
	ThisConstructor (int a,float b){
		System.out.println("parameterized constructer");
	}
	ThisConstructor (int a){
		System.out.println("parameterized constructor 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor as=new ThisConstructor (12);
		ThisConstructor shr = new ThisConstructor (12,23.4f);
		ThisConstructor ash = new ThisConstructor ();


	}

}
