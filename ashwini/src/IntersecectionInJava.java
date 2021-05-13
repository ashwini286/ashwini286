import java.util.*;
public class IntersecectionInJava {
	public static void main(String[] args) {
	ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
	arraylist1.add(34);
	arraylist1.add(25);
	arraylist1.add(12);
	arraylist1.add(45);
	 System.out.println("arraylistList1: "  + arraylist1); 

	  
	
	ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
	arraylist2.add(32);
	arraylist2.add(25);
	arraylist2.add(12);
	arraylist2.add(40);
	 System.out.println("arraylistList2: "  + arraylist2);
	 
	 ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
	 
	for(int ac : arraylist1) {
        if (arraylist2.contains(ac)) { 

            arraylist3.add(ac);   
        }
    }
 
    System.out.println("Common elements: " + arraylist3); 
	}
}



