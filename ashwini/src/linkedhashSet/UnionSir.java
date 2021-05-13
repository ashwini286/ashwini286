package linkedhashSet;

import java.util.HashSet;

public class UnionSir {
	public static void main(String args[]) {
	HashSet<Object> set1 = new HashSet<>();
	set1.add(2);
	set1.add("amar");
	set1.add(5);
	set1.add("bca");
	System.out.println("set 1:="+set1);
	
	HashSet<Object> set2 = new HashSet<>();
	set2.add(27);
	set2.add("amar");
	set2.add(50);
	set2.add("bca");
	
	System.out.println("set2 ="+set2);
    set2.addAll(set1);
    System.out.println("union is : "+set2);
}

}

