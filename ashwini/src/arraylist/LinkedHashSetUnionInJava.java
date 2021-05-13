package arraylist;

import java.util.LinkedHashSet;

public class LinkedHashSetUnionInJava {

	public static void main(String[] args) {
		LinkedHashSet<Object> ash=new LinkedHashSet<>();
		ash.add("ash");
		ash.add(34);
		ash.add("shr");
		ash.add(10.4f);
      System.out.println("linkedhashset = "+ash);
      
		LinkedHashSet<Object> ash2=new LinkedHashSet<>();
		ash2.add("ash");
		ash2.add(24);
		ash2.add("as");
		ash2.add(10.4f);
		System.out.println("linkedhashset = "+ash2);
 
		ash2.addAll(ash);
		System.out.println("union is = " +ash);

	}

}
