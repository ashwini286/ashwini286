package collectionInJava;
import java.util.*;

public class Map {

	public static void main(String[] args) {
//	HashMap<String , Integer> hm = new HashMap<>();
	LinkedHashMap<String,Integer> hm1 = new LinkedHashMap<>();
		//it dosen't maintains any order
		//it is not synchronized.		
		//map is allow to duplicate value		
				hm.put("a", 10);
				hm.put("ab", 10);
		//Hashmap does't contain duplicate key but it contain duplicate value in map		
		//if u are  insert duplicate key  then compiler ignore that and print only one value	
				hm.put("abc", 90);
				hm.put("abc", 30);		
				hm.put("abcd", 80);
		//hashMap allow null key & value but TreeMap does't allow null key or value		
				hm.put("null",null);
				System.out.println(hm);
		/* this (get) method return the value when key is given. if any key does not
		 * have any value then whit it, then it will return null value.		
		 */
				System.out.println(hm.get("ab"));
		// if u want to see only key then this method will be used keyset();		
		System.out.println(" key " +hm.keySet());
		//if u check the value of present in map or not. if value of present
		// it will return true otherwise it will return false.
		System.out.println(hm.containsValue(100));
		//if u want to see only value then this method will be used value();
		System.out.println("value " +hm.values());
		//if u check the you map is empty or not then it will be used
		// if you map is empty then it will return true otherwise it will return false
		System.out.println(hm.isEmpty());
		// if u want to know your map size then it will be  used size();
		System.out.println(hm.size());
		//if u want to remove any element them we can use thiis.
		hm.remove("ab", 10);
		System.out.println(hm);
		System.out.println("entery set " +hm.entrySet());
		System.out.println("%%%%%%%%%%%%%%%%%%%%");
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println("key =" + entry.getKey() + " , value =" + entry.getValue());
		}
			}

		}

	}

}
