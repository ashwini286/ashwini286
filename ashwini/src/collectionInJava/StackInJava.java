package collectionInJava;
import java.util.*;
public class StackInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.add(34);
		st.add(54);
		st.add(87);
		st.add(90);
		st.add(123);
		System.out.println(st);
		st.pop();
System.out.println(st);
st.push(12);
System.out.println(st);
System.out.println("$$$$$$$$$$");
System.out.println(st.peek());
 System.out.println(st.search(54));
 System.out.println(st.isEmpty());
	}

}
