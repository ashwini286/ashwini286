package threaddemo;

public class PrintNumberAnupSir {

		
		public void printNo(int no) {		
				
				synchronized (this) {
					for(int i=no;i<=no+10;i++) {
						System.out.println(i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}	
				}
							
			}
		}

		 class ThreadDemo2 extends Thread{
			
			
			PrintNumberAnupSir printno;
			
			ThreadDemo2(PrintNumberAnupSir printno){
				this.printno=printno;
			}
			@Override
			public void run() {
				// TODO Auto-generated method stub
				printno.printNo(20);
			}	
		}

		 class ThreadDemo extends Thread{
			
			
			PrintNumberAnupSir printno;
			
			ThreadDemo(PrintNumberAnupSir printno){
				this.printno=printno;
			}
			@Override
			public void run() {
				// TODO Auto-generated method stub
				printno.printNo(10);
			}	

public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				PrintNumberAnupSir printno=new PrintNumberAnupSir();
				
				ThreadDemo t1=new ThreadDemo(printno);
				t1.start();	
				
				
				ThreadDemo2 t2=new ThreadDemo2(printno);
				t2.start();	
				

			}

		}

