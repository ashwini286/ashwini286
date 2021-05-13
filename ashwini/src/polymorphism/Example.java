package polymorphism;

//public class Example {
	class Example
	{
	    String name;
	    int age;
	 Example(){
	     this("abc");
	     System.out.println("hi i am default contstructer");
	 }  
	 Example(String s){
	     this("ab" , 6);
	    System.out.println("hi i am paramitrized 1");
	    
	 }
	 Example(String s,int age){
	     this.name=s;
	     this.age=age;
	     System.out.println("hi i am paramitrized 2");
	     
	 }
	    void displayValues() {
	        System.out.println("First Name : " + name);
	        System.out.println("Age : " + age);
	    }

		public static void main(String[] args) {
			Example obj = new Example();
			obj.displayValues();
		}
	}


