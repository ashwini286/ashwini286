package arraylist;

import java.util.ArrayList;

public class CreatejavaArrayListInJava {
		public static void main(String args[]){  
		      ArrayList<String> a =new ArrayList<String>();  
		      a.add("Rimpi");  //index 0
		      a.add("amar sir");  //index 1
		      a.add("Neha");    //index 2
		      a.add("utkarsh");    //index 3      
		      a.add("Deepak");    //index 4
		  //    a.add("sohan");   //index 5
           //     a.add(10.3);
		  
		      //displaying elements
		      System.out.println(a);
		      // add the element of index number
		      a.add(4, "ram");
		      System.out.println(a);
		      //set the value of according the index number
		       a.set(0, "ram");
		       System.out.println(a);
		       System.out.println("***********");
		       //remove the element
// we are remove in two way 1. remove.method(index number); 2.remove.method(object);
		       System.out.println("@@@@@@@@@@@@@@");
		       a.remove(2);     // remove.method(index number);
		       System.out.println(a);
		       a.remove("sohan");  //remove.method(object);
		       System.out.println(a);
		       System.out.println(a.indexOf("shreya"));
		       System.out.println(a.lastIndexOf("shreya"));
		       System.out.println("&&&&&&&&&&&");
		       System.out.println(a);
		       //access elements
		       System.out.println("...........................");
		       String sr = a.get(0);
		      System.out.println(sr);
		      //SIZE
		      System.out.println("SIZE= "+a.size());
		      //setting value according to index number
		      a.add(1, "ram");
		      System.out.println(a);
		      //remove of the element and arrange new element
		      a.set(3, "mohan");
		      System.out.println(a);
		      //traversing
		      //for each loop
		      System.out.println("%%%%%%%%%%%%%");
		      for(String nms:a) {
		    	  System.out.println(nms);
		  
		    //	  System.out.println(nms +"\t" +((String) nms).length());
		    	  //reverse the element
		    //	  StringBuffer br=new StringBuffer(nms);
		    //	  System.out.println(br.reverse() + "\t" +br.length());
		    	  //check for empty
		//    	  System.out.println(a.isEmpty());
		    	  //clear all element
		    	//  a.clear();
		//    	  System.out.println(a);
		      }
		   }  
		}

//if u make object type of arrayList you are able to store both type of data
		// 1. homogeneous type 2. heterogeneous type