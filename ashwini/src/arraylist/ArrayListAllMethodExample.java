package arraylist;
import java.util.*;

public class ArrayListAllMethodExample {

	public static void main(String[] args) {
		ArrayList<String> sc=new ArrayList<String>();  
		sc.add("ashwini");
		sc.add("gita");
		sc.add("null");
		sc.add("sita");
		
		ArrayList<String> sc1=new ArrayList<String>();
            sc1.add("cow");
            sc1.add("dog");
            sc1.add("rat");
/* add all method is use to add the every element in the 1st arrayList and 2nd arrayList */            
          sc.addAll(sc1);
            System.out.println(sc);
            System.out.println("******************");
            sc.addAll(2, sc1);
            System.out.println(sc);
            System.out.println("%%%%%%%%%%%%%%%%%%%%%");
    System.out.println(sc.contains("gita"));
    System.out.println("##################");
  System.out.println(sc.indexOf("null"));
  System.out.println("@@@@@@@@@@@@@@@@@@");
	ArrayList<String> list=new ArrayList<String>(Arrays.asList("ash","ashwini","shr"));
	System.out.println(list);
	System.out.println("!!!!!!!!!!!!!!!!!!!");
	System.out.println(list.size());
	/* if u find the index number */
	System.out.println("$$$$$$$$$$$$");
	int i = list.lastIndexOf("ash");
	System.out.println(i);
	System.out.println("/////////////");
/* if u want to print all the arraylist print the only odd number then you can print like as !!!....*/	
	ArrayList<Integer> sc2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    sc2.removeIf(n -> n%2== 0);
    System.out.println(sc2);
	 
	
	
  
            
	}

}
