package arraylist;
import java.util.LinkedList;
public class AllMethodUseInLinkedListInJava {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList();
		a.add(5);  //0
		a.add(4);   //1
		a.add(5);   //2
		a.add(6);   //3
		System.out.println(a);
		a.addFirst(9);
		System.out.println(a);
		a.addLast(13);
		System.out.println(a);
		a.removeFirst();
		System.out.println(a);
	a.removeLast();
	System.out.println(a);
      System.out.println(a.contains(9));
	System.out.println(a.indexOf(4));
   System.out.println(a.get(2));
System.out.println( a.getFirst());
System.out.println(a.getLast());
System.out.println("*************");
System.out.println(a.element());
System.out.println("&&&&&&&&&&");
System.out.println(a.get(1));
a.set(0, 45);
System.out.println(a);
a.remove(2);
System.out.println(a);
System.out.println(a.size());
a.lastIndexOf(5);
System.out.println(a);
a.add(3, 23);
System.out.println(a);
	}

}
