package display;

public class Singleinharitance {
	String name="ashwini";
	float salary=20000;
}
class SoftwareProgrammer extends Singleinharitance{
	int age= 21;
	public static void main(String[] args) {
		SoftwareProgrammer obj= new SoftwareProgrammer();
		System.out.println("SoftwareProgrammer name= "+obj.name);
		System.out.println("SoftwareProgrammer salary= "+obj.salary);
		System.out.println("SoftwareProgrammer age= "+obj.age);
	}

}
