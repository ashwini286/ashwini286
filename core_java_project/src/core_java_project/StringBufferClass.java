package core_java_project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferClass {

	public static void main(String[] args) throws IOException {
		//create empty string buffer string
		StringBuffer sb = new StringBuffer();
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//accept surname
		System.out.println("enter surName");
		String sur = br.readLine();
		
		//accept middlename
		System.out.println("enter midname");
		String mid = br.readLine();
		 
		//accept lastName
		System.out.println("enter lastname");
		String last = br.readLine();
		
		//append sur to sb
	    sb.append(sur);
	    
	    //append last to sb
	    sb.append(last);
	    
	    //display the name till now
	    System.out.println("Name = "+sb);
	    
	    
	}

}
