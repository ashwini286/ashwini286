package threaddemo;
 // import java.util.*;
public class ImpimentRunnableClass implements Runnable {
	int n =8 ;
	  public void run() {
		  
		for( int i=1;i<=10;i++) {
			 System.out.println( n+ "*" +i+ "=" +n*i);
		}

	
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc = new Scanner(System.in);
		System.out.println("enter the  any number to find table ");
		System.out.println("****************************");
		System.out.println("enter the  number");
//	int	 n = sc.nextInt();
	System.out.println("&&&&&&&&&&&&&&&&&&&&&");
	ImpimentRunnableClass t = new ImpimentRunnableClass();
	Thread t1 = new Thread(t);
	t1.start();
	}

	

}
