package linkedhashSet;

import java.util.ArrayList;
public class IntersectionJava {
		public static void main(String[] args) {
	        // create ArrayList list1 

	        ArrayList<String> list1 = new ArrayList<String>(); 
	        // Add values in ArrayList 
	        list1.add("Hii"); 
	        list1.add("i "); 
	        list1.add("am"); 
	        list1.add("amar"); 
	        // print list 1 
	        System.out.println("List1: " + list1); 

	          // Create ArrayList list2 

	        ArrayList<String> list2 = new ArrayList<String>(); 
	   // Add values in ArrayList 

	        list2.add("i "); 

	        list2.add("am"); 

	        list2.add(" A Student "); 
	 // print list 2 

	        System.out.println("List2: "  + list2); 

	  

	        // Create ArrayList list3 

	        ArrayList<String> list3 = new ArrayList<String>(); 

	      // Find common elements  while iterating through list1 

	        for (String temp : list1) { 
	        	// Check if the  element is  present in list2 or not 

	            if (list2.contains(temp)) { 

	            	// Since present, add it to list3 

	                list3.add(temp);  
	            } 

	         
	        }
	  

	        // print common elements from list 3 

	        System.out.println("Common elements: " + list3); 

	    } 


	}

