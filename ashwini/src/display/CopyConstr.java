package display;

public class CopyConstr {
	public String name;
	public int age;
public CopyConstr(String name,int age) {
	this.name=name;
CopyConstr(CopyConstr c){
	System.out.println("copy constructer");
   name=c.name;
 age=c.age;
}

	public static void main(String[] args) {
		CopyConstr obj=new CopyConstr ("ashwini",10);
		CopyConstr  std= new CopyConstr (std);

	}

}
