package polymorphism;

public class Animal {
	/*SuperConstroucter(){ 
		System.out.println("default constroucter");
	}
}
	class child extends SuperConstroucter {
		child(){
			super();
			System.out.println("child class constroucter");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj = new child();
	//	SuperConstroucter  obj = new SuperConstroucter ();

	}

} */
//class Animal{  
String color="white";
  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  
System.out.println(color);//prints color of Dog class  
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
Dog d=new Dog();  
d.printColor();  
}
}
