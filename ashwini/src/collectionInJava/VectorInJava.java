package collectionInJava;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<String> v = new Vector<>();
       /* 1.vector same as a arraylist.
        * 2. it is littel bit slower.
        * 3. it is synchronized.
        * 4. vector contain many legacy method.
        * 
        */
       v.add("ashwini");
       v.add("rimpi");
       v.add("neha");
       System.out.println(v);
       v.addElement("ram");
       System.out.println(v);
       v.equals("mohan");
       System.out.println(v);
       v.add(0, "sohan");
       System.out.println(v);
       v.removeElement("rimpi");
       System.out.println(v);
       v.set(1, "amar");
       System.out.println(v);
       System.out.println("########");
       System.out.println(v.lastElement());
     System.out.println(v.get(2));
    System.out.println(v.indexOf("neha"));
    System.out.println("****************");
    System.out.println(v.elementAt(3));
    System.out.println("&&&&&&&&&&");
    v.setSize(6);
    System.out.println(v);
      System.out.println(v.size());
System.out.println(v.lastIndexOf("mohan"));
System.out.println("convart vector into list");
for(String str : v) {
	System.out.println(str);
	
}
ArrayList<String> list = Collections.list(v.elements());
System.out.println("/n list element");
for(String str2 : list) {
	System.out.println(str2);
}

	}

}
