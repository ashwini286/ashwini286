package cloneObj;
   //multilevel inharitance//
public class LevelInharitance {
	int total;
	void sum ( int x,int y) {
		total=x+y;
		System.out.println("sum= "+total);
	}
}
 class subtract extends LevelInharitance {
	void sub (int x,int y){
		total=x-y;
		System.out.println("subtract= "+total);
	}
}
 class mul extends subtract {
	void mul(int x,int y) {
		total=x*y;
		System.out.println("multipli= "+total);
	}
	public static void main(String[] args) {
	int x=20,y=30;
		mul obj=new mul();
		obj.sum(x,y);
		obj.sub(x,y);
		obj.mul(x, y);
	}
		

	}

