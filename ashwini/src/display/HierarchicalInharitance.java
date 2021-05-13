package display;

public class HierarchicalInharitance {
	void mymethod() {
		System.out.println("method of class mymethood");
	}
}
class B extends HierarchicalInharitance {
	void display() {
		System.out.println("method of b");
	}
}
class C extends HierarchicalInharitance{
	void ash() {
		System.out.println("method of c");
	}
	public static void main(String[] args) {
		C obj=new C();
		obj.mymethod();
		obj.ash();
	}

}
