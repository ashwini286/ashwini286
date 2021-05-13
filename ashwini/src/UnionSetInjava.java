import java.util.HashSet;

public class UnionSetInjava {
public static void main(String[] args) {
        HashSet<Integer> as = new HashSet<>();
		as.add(2);
		as.add(34);
		as.add(54);
		as.add(65);
		System.out.println("hashset 1:="+as);
		
		HashSet<Integer> as2 = new HashSet<>();
		as2.add(27);
		as2.add(34);
		as2.add(50);
		as2.add(54);
		
		System.out.println("hashset2 ="+as2);
        as2.addAll(as);
        System.out.println("union is : "+as2);
	}

}
