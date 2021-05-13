package polymorphism;

public abstract class InterfaceInjava {
       public abstract void name ();
       public void age(){
    	   System.out.println("ashwini");
       }
}
     class  Implement extends InterfaceInjava{
    	 public void ash() {
    		 System.out.println("shreya");
    	 }

	@Override
	public void name() {
		System.out.println("minmin");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implement as = new Implement();
		as.ash();
		as.name();
		as.age();
	}
	
}