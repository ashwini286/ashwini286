public class AbstrectStudent{
	public static void main(String args[]) {
		SchoolId s=new SchoolId();
		s.name();
		s.age();
		s.id();
		s.place();
		s.schoolname();
		}
}
abstract class Details{
	public abstract void name();
	public abstract void age();
	public void schoolname(){
		System.out.println("schoolName = adarsh shishu vatika madanpur");
	}
}
 class SchoolId extends Details{
	public void id() {
		System.out.println("school id = 12345@#$%&");	
		}
	public void place() {
		System.out.println("place = madanpur , (aurangabad) , bihar");
	}
	@Override
	public void name() {
		System.out.println("student name");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void age() {
		System.out.println("student age");
		// TODO Auto-generated method stub
		
	}
}