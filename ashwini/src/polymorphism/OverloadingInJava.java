package polymorphism;

public class OverloadingInJava { //same class
	void sum(int a,float b) {    //mathod name same but argument different
		System.out.println("ashwini");
	}
	void sum(float a,int b) {  //method name is same but argument different
		System.out.println("sharma");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingInJava ash = new OverloadingInJava(); 
		ash.sum(10, 10.4f); //method call
		ash.sum(10.4f,39);
	}

}
