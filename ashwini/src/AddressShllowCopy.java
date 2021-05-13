
public class AddressShllowCopy {
//	class Address
	private String city;
	{
		String hNo="2-N/";
		String SName="kutumba";
		String city="aurangabad";
		public String toString()
		{
			String SName;
			String hNo;
			return "hNo="+hNo+"\nsName="+SName+"\ncity="+city;
		}
	}
	class Employee implements Cloneable 
	{
		String name="amar";
		String id="27";
		add=new Address();
		public String toString()
		{
			return "name="+name+"\nid="+id;
		}
		public Employee clone() throws CloneNotSupportedException
		{
			Employee e = (Employee)super.clone();
			return e;
		}
	}
	 class DemoShallowCloning {

		public static void main(String[] args)
		throws  CloneNotSupportedException
		{
			Employee e1=new Employee();
			System.out.println(".......ORIGINAL OBJECT.......");
			System.out.println(e1);
			System.out.println(e1.add);
			System.out.println("hash code of e1="+e1.hashCode());
			
	Employee e2=e1.clone();// cloning process 
	System.out.println("......CLONED OBJECT ......");
	System.out.println(e2);
	System.out.println(e2.add);
	System.out.println("hash code of e2 ="+e2.hashCode());
	if (e1.add==e2.add)// proving which type of copy
	{
		System.out.println("....shallow copy cloning.......");
		
	}
	else
	{
		System.out.println("...deep copy cloning ....");
	}
		}
	}



