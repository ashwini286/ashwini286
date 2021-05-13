package collectionInJava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> as = new LinkedHashSet<Object>();
/* 1.linkedlist class contain unique element only like hashset.
2. it doesn't contain duplicate value.
3. it provide all operation set operation and permite null value
4. it is maintain insertion order.
5.it is the best choice to develop cache besed application.
note :-
it are used when u want to not dublicat value but insertion are preserved
the we an used linkedhashset.
 * 		
 */
		as.add(12.3f);
		as.add("ashwini");
		as.add(34);
		as.add(null);
		as.add(null);
		System.out.println(as);
//if u want to know given value are present in set or not then it will used it
//if element are present the it will return true otherwise it will return false		
		System.out.println(as.contains(12.3f));
//if u want to know size of set then it will used.		
		System.out.println(as.size());
//if u want to know your set is empty or not then it will used that if your
//set is empty then it will return true otherwise it will return false		
	   System.out.println(as.isEmpty());
//if u want to remove any element then it will used it.	   
	    as.remove(34);
	    System.out.println(as);
//if u want to know which class to access this set then it will used
	    System.out.println(as.getClass());
	    //clear all element.
	    as.clear();
	    System.out.println(as);
		
		
	}
}
