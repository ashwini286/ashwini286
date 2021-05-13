package collectionInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJavacollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hash = new HashSet();
//Duplicate are not allow		
// it contain only unique value.
//it is not synchronized.
//it doesn't maintain the insation order
// it is best approach for search operation.
//Heterogeneous element are allow
//the initial default capacity of 16 and load factor is 0.75
 		hash.add(10);
		hash.add(10);
		hash.add(20);
		hash.add(70);
		System.out.println(hash);
		System.out.println("**********");
	System.out.println(hash.clone());
// we can use is empty method if u want to know you set is empty or not	
System.out.println(hash.isEmpty());
// you can remove very easily bt the help of remove method
hash.remove(30); 
System.out.println(hash);
//if u want to know you set size then it can use is method 
System.out.println(hash.size());
//if u want to know which class are access this method
System.out.println(hash.getClass());
//iterator for  each loop
for(Object a : hash) {
	System.out.println(a);
}
System.out.println("*************");
//iterator 
Iterator sc = hash.iterator();
while(sc.hasNext()) {
	System.out.println(sc.next());
}
System.out.println("&&&&");

for(int i=0;i<hash.size();i++) {
	hash.add(i);
}
	}

}