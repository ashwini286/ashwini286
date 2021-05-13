package polymorphism;
import java.io.*;     

public class MainOverLoadInJava {
public static void main(String b) {
	System.out.println("ashwini");
	
}
public static void main(float a) {
	System.out.println("sharma");
}
public static void main(String args[]) {
	
	 MainOverLoadInJava ash = new  MainOverLoadInJava();
	 ash.main("abc");
	 ash.main(12.3f);
	 
}

}
	














/*import java.io.*;     
    
	  // Normal main()
	  public static void main(String[] args) {
	    System.out.println("Hi Geek (from main)");
	//    MainOverLoadInJava.main("Geek");
	  }     
	  // Overloaded main methods
	  public static void main(String arg1) {
	    System.out.println("Hi, " + arg1);
//	    MainOverLoadInJava.main("Dear Geek","My Geek");
	  }
	  public static void main(String arg1, String arg2) {
	    System.out.println("Hi, " + arg1 + ", " + arg2);
	  }
}*/
