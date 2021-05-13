
public interface DefaultInterface {
void display();
//**********DEFAULT METHOD IN JAVA BY INTERFACE************//
default void show() {           //default method in java
	System.out.println("Default Interface");
}
//*******************STATIC METHOD IN JAVA BY INTERFACE*********/
static int cube(int x) {       //static method in interface
	return x*x*x;
}
class Cricle implements DefaultInterface {
public void drawable() {
	System.out.println("drawing cricle");
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("details of student");
	}
	public static void main(String args[]) {
		Cricle obj=new Cricle();
		obj.display();
		obj.show();
		obj.drawable();
		obj.cube(3);
	}
	private void cube(int i) {
		System.out.println(DefaultInterface.cube(3));
		// TODO Auto-generated method stub
		
	}
}
	
}
