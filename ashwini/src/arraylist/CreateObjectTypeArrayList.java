package arraylist;
import java.util.*;
public class CreateObjectTypeArrayList {
		public static void main(String[] args) {
 ArrayList<Object> a=new ArrayList<Object>();		
 a.add(null);
 a.add(10.3);
 a.add("ash");
 a.add(10.4f);
 a.add(10.3);
 a.add("ashwini");
 System.out.println(a);
 for (Object ash : a) {
	  System.out.println( "\t" +(Object)  ash);
	
}
  System.out.println(a.get(2));
  System.out.println(a.set(5,"neha"));
  System.out.println(a.contains("ash"));
  System.out.println(a.indexOf(10.3));
  System.out.println(a.hashCode());
  System.out.println(a.size());
  System.out.println(a.isEmpty());
	}

}
