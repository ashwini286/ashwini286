//************NESTED INTERFACE IN JAVA ***********//
public interface NestedInterfaceInJava {
void display();
interface printable{
	void Show();
}
}
class Abc  implements NestedInterfaceInJava,printable{
	void test() {
		System.out.println("hello");
	}

	@Override
	public void display() {
		System.out.println("hii");
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		Abc obj=new Abc();
		obj.test();
		obj.display();
		//obj.show();
	}
}
