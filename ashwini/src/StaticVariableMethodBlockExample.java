
//public class StaticVariableMethodBlockExample {
/*	String studentName;    //Intance variable
	static String college="Kishori Sinha"; //static variable
	//constructor to initialize the variable
	StaticVariableMethodBlockExample(String n){
		studentName=n;
	}
void display(){  //method to display values
	System.out.println("Student Name : "+studentName +"  College Name : "+college);
	}
public static void main(String args[]) {
	StaticVariableMethodBlockExample obj=new StaticVariableMethodBlockExample("ashwini");
	obj.display();  //calling display method
}
} */
 
/* static block */
/* static block example 
public class StaticVariableMethodBlockExample {
	String studentName;    //Intance variable
	static String college="Kishori Sinha"; //static variable
	/*****static block******
	// static block is use to change the static variable suppose that ..... in above my
	//static variable .... static String college="kishori sinha"; then i want to change my
	//collage name (sinha college) then i can change in the static block. 
	static {  //static block
		 college="sinha collage";
		}
	
	//constructor to initialize the variable
	StaticVariableMethodBlockExample(String n){
		studentName=n;
	}
void display(){  //method to display values
	System.out.println("Student Name : "+studentName +"  College Name : "+college);
	}
public static void main(String args[]) {
	StaticVariableMethodBlockExample obj=new StaticVariableMethodBlockExample("ashwini");
	obj.display();  //calling display method
}
} */
	
  

// static method *****
  public class StaticVariableMethodBlockExample {
	String studentName;    //Intance variable
	static String college="Kishori Sinha"; //static variable 
	/* static method important note
	1.	A static method can access static data member and can change the value of it .
	2.   it is used to initialize the static data member.
	3.   it is executed before the main method at the time of classloading.*/
		
/*static void change()  //static method
{
	System.out.println("hii");
//college="sinha collage";	
}
	void show() {
		System.out.println("hello");
	}
	
	//constructor to initialize the variable
	StaticVariableMethodBlockExample(String n){
		studentName=n;
	}
void display(){  //method to display values
	System.out.println("Student Name : "+studentName +"  College Name : "+college);
	} 
public static void main(String args[]) {
	 //StaticVariableMethodBlockExample.change();
	StaticVariableMethodBlockExample obj=new StaticVariableMethodBlockExample("neha");
	obj.display(); //calling display method
	obj.show();
	StaticVariableMethodBlockExample.change();

}
} */
	
