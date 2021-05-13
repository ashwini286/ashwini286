package cloneObj;

public class DeepCopy {
	int a,b;
	DeepCopy(int x,int y){
		a=x;
		b=y;
	}

 DeepCopy (DeepCopy p){
	 a=p.a;
	 b=p.b;
		System.out.println("value of"+a );
		System.out.println("value of"+b);
 }
public static void main(String[] args) {
	DeepCopy obj=new DeepCopy(10,20);
	DeepCopy obj2=new DeepCopy(obj);
	}
}
