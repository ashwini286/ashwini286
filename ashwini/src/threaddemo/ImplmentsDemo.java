package threaddemo;

public class ImplmentsDemo implements Runnable{
	public void run() {
		int n=7;
		for(int i=1;i<=n;i++) {
			n=n+i;
		}
		System.out.println("result = " +n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplmentsDemo sc = new ImplmentsDemo();
		Thread sc1  = new Thread();
		sc1.start();

	}

}
