//**********MULTIPLE INHARITANCE IN JAVA**************//
public interface MultipleInterfaceStudent {
void StudentName(); 
}
interface Showable{
	void Show();
}
class A7 implements MultipleInterfaceStudent,Showable{
	public void Age() {
		System.out.println("StudentAge");
	}
	public void SchoolName() {
		System.out.println("SchoolName");
	}

	@Override
	public void Show() {
		System.out.println("Student details show");
		// TODO Auto-generated method stub
	}

	@Override
	public void StudentName() {
		System.out.println("StudentName");
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		A7 obj=new A7();
		obj.Age();
		obj.SchoolName();
		obj.StudentName();
		obj.Show();
	}
}
