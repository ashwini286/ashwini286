package collectionInJava;

import java.util.LinkedHashMap;

public class LinkedHashMapInJava {

	public static void main(String[] args) {
LinkedHashMap<Object,Integer> s = new LinkedHashMap<>();
/*linked hashmap contain unique key if u are not insert uniqe key then 
complier ignore that */
//it is non synchronized.
//it is maintain insertion order
s.put("z", 12);
s.put("y", null);
/*it linkedHash map may have only one null key but multiple null value
/if u insert the multiple null key the complier ignore that */
s.put("null", 12);
s.put("null", 52);
s.put("v", null);
System.out.println(s);
/*if u check that is given value is present or not then it will used if
that element is present the it will return true otherwise it will
return false */
// it will used same method in heshmap. 
System.out.println(s.containsValue(34));
	}

}
