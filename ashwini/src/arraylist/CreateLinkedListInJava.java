package arraylist;

import java.util.Arrays;
import java.util.LinkedList;
public final class CreateLinkedListInJava {
// linklist is heterogeneous means you are create different type of element
	public static void main(String[] args) {
		 LinkedList <Object> al2=new LinkedList<>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist  //int type  
		  al2.add("200");    
		  al2.add("10.5F");    
		  al2.add("300");   
		  System.out.println(al2);
		  al2.remove("300");
		  System.out.println("linkedlist: "+al2);  
		  System.out.println(al2);
		  al2.remove(3);
		  System.out.println("remove after list:  "+al2);
		  al2.size();
		  System.out.println("length =" +al2);
		  for(Object sc : al2) {
				  System.out.println("\t" +(Object)  sc);
				  }
				  }

			  
}