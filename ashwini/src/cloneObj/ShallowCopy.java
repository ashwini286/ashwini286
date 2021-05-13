package cloneObj;

public class ShallowCopy {
	int a=13;
	int b=45;
	ShallowCopy(int x,int y){
		a=x;
		b=y;
		
		System.out.println("value of"+x );
		System.out.println("value of"+y);
	}
void	printopy() {

	System.out.println("value of"+a );
	System.out.println("value of"+b);
}
	public static void main (String[] args) {
		ShallowCopy obj=new ShallowCopy(12,8);
		ShallowCopy obj2=obj;
		obj2.printopy();

	}
}
