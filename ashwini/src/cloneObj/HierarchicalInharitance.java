package cloneObj;

public class HierarchicalInharitance {
  int s;
  void sum(int x,int y) {
	  s=x+y;
	  System.out.println("sum= "+s);
  }
}
class sub extends HierarchicalInharitance{
	void disp(int x,int y) {
		s=x-y;
		System.out.println("sub= "+s);
	}
}
class Mulli extends HierarchicalInharitance{
	void multi(int x,int y) {
		s=x*y;
		System.out.println("mul= "+s);
	}
	public static void main(String[] args) {
	int	x=40,y=80;
Mulli obj=new Mulli();
obj.sum(x,y);
//obj.disp(x,y);
obj.multi(x, y);
	}
}
