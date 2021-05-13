package display;

public class Multilevelinharitace {
	String name="ashwini";
	float salary=20000;
}
	class b extends Multilevelinharitace{
		int age=21;
		String addres="madanpur";
	}
	class c extends b{
		String fatharname="arun parsad sharma";
		
		
	public static void main(String[] args) {
		c obj=new  c();
		System.out.println("name= "+obj.name);
		System.out.println("salary= "+obj.salary);
		System.out.println("age= "+obj.age);
		System.out.println("address= "+obj.addres);
		System.out.println("fathername= "+obj.fatharname);
	}

}
