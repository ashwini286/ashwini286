package collectionInJava;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class IteratorDemoInJava {

	public static void main(String[] args) {
		Set<String> ash = new LinkedHashSet<>();
		ash.add("ashwini");
		ash.add("sharma");
		ash.add("shreya");
		ash.add("sahastra");
	//	System.out.println(ash);
/*for each loop retrieving 
		for(String s : ash) {
			System.out.println(s);
		}
		System.out.println("&&&&&&&&&&&&"); */
/* Iterator Interface retrieving		
		Iterator<String> as = ash.iterator();
			while(as.hasNext()) {
				System.out.println(as.next());
				}
			while(as.remove()){
			System.out.println(as);

			} */
// ListIterator interface
		ListIterator<String> itr = ash.ListIterator<String>();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} 
			
		}
	
			
		}
	


