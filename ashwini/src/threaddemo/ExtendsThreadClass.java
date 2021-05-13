package threaddemo;

public class ExtendsThreadClass extends Thread {
	public void run() {
		for(int i=2;i<=100;i++) {
			if(i%2==0) {
				System.out.println("number is sum = " +i);
			}
			else
			{
				System.out.println("number is odd = " +i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThreadClass t = new ExtendsThreadClass();
		t.start();

	}

}
