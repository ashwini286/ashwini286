package threaddemo;

public class UseMethodThreadClass extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
		
		/* sleep mode for the specified number of milliseconds
		 * 2nd method sleep mode
		 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				System.out.println("child class = " +i);
			}
			*/
	System.out.println("child thread name :" +Thread.currentThread().getName());;
		System.out.println("child class job" +i);
	
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UseMethodThreadClass t1 = new UseMethodThreadClass(); 
         t1.start();
         
         for(int i=0;i<=10;i++) { 
	      try {
			t1.join(1000);
		} catch (InterruptedException e) {
			System.out.println("main thread" +i);
		}
// if check the thread is alive or not	      
          System.out.println(t1.isAlive());
  		
 /* first method of thread class yield method it is used to stop the 
  * currently executing thread and will give a chance to other waiting 
  * thread of same priority. if in case there no waiting threads or 
  * if all the waiting threads have low priority then the same thread 
  * will continue its execution.
  * 
  */
  			/* set priority 
  			t1.setPriority(MAX_PRIORITY);
  			t1.yield(); */
          System.out.println("thread name :" +Thread.currentThread().getName());
  			System.out.println("main thread = " +i);
  	}
  
	}

}

