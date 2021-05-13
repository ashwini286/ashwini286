package collectionInJava;

import java.util.*;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> as=new TreeSet<>();
		/* 1. it contains unique value like hash set
		 * 2. tree class access the retrieval time are quite fast.
		 * 3. treeset allow to null value but only once.
		 * 4. it is not preserved but all object will be inserted accoding
		 * to some sorting order.
		 * 5.it is not synchronized.
		 * 6. Heterogeneous element are not allowed 
		 * 
		 */
		as.add("a");
		as.add("b");
		as.add("c");
		as.add("d");
		as.add("null");
		System.out.println(as);
		System.out.println("traversing element through iterator in descending order");
	    Iterator<String> i= as.descendingIterator();
	     while(i.hasNext()) {
		 System.out.println(i.next());
		 System.out.println("higest value:" +as.pollFirst());
		 System.out.println("lowest value :" +as.pollLast());
		 System.out.println("initial set" +as);
		 System.out.println("Reverse set" +as.descendingSet());
	 }
	}

}
