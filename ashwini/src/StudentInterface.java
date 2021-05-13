
public interface StudentInterface {
     public void name();
   public  interface StudentAge extends StudentInterface{
    	 public void Age();
     }
 public  class StudentName implements StudentInterface,StudentAge{
public void SchoolName() {
	System.out.println("SchoolName");
}
	@Override
	public void Age() {
		// TODO Auto-generated method stub
		System.out.println("StudentAge");
	}

	@Override
	public void name() {
		System.out.println("StudentName");
	}
		// TODO Auto-generated method stub
	public static void  main(String args[]) {
		StudentName s=new StudentName();
		s.name();
		s.Age();
		s.SchoolName();
	}
		
	}
	   
   }
