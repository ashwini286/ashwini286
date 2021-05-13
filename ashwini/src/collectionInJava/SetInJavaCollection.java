package collectionInJava;
import java.util.*;
public class SetInJavaCollection {

	public static void main(String[] args) {
		Set<Object> as = new LinkedHashSet<Object>();
		/* 1. in set duplicate are not allowed.
		 * 2. in set order not preserved.
		 * 3. it will work on nodes.
		 * note:-
		 *      it is used when manipulate(insertion,deleation) the data 
		 * 4. set interface only allowed a single null value.
		 */
		as.add(12);
		as.add("ash");
		as.add(34);
		as.add(12.3f);
		as.add(45.2);
		System.out.println(as);
		as.remove(34);
		System.out.println(as);
		System.out.println(as.contains(12));
		System.out.println(as.isEmpty());
		System.out.println(as.size());
		System.out.println("*****");
		System.out.println("ash".equals(45.2));
        System.out.println(as.retainAll(as));
      //   as.clear();
      //   System.out.println(as);
      //return :- the hash code value for this set
System.out.println(as.hashCode());
	}

}
