package collectionInJava;

import java.util.TreeMap;

public class TreeMapInJava {

	public static void main(String[] args) {
     TreeMap<String,Integer> B = new TreeMap<>();
/*it doesn't contain duplicate value. if u are insert duplicate value 
then complier ignore them*/
// it maintains asccending order.
// it is not synchronized.     
    B.put("a", 12);
    B.put("ab", null);
// it will insert only homogeneous element    
    B.put("c", null); 
//it contain only one null key but multiple null value    
    B.put("null", null);
    B.put("null", 2);
    System.out.println(B);
// here same method like hashmap u can use..........
    
    
/*  It is a COMPARABLE INTERFACE only one method compareTo.
 *  if you compare the 1 obj to 2 obj then it will used
 * return + (obj 1 has to come before obj 2)
 * return - (obj + has to come after obj 2)
 * return 0 (obj 1 & obj 2 are equal)
 *     
 */
    System.out.println("null".compareTo("c")); // it return + value
    System.out.println("a".compareTo("c")); // it return - value
    System.out.println("a".compareTo("a")); //it return 0 value
    
    /* It is COMPARATOR  INTERFACE it has two method 1. compare 2. equals
     * equal check the element is equal or not if it is not equal then will return
     * false otherwise it will return true 
     * compare wala samaj me na aa rha h 
     */
System.out.println("ab".equals("ab"));
//System.out.println(B.compare("a"));
	}

}
