//******* EXAMPLE MULTIPLE INHARITANCE INJAVA BY INTERFACE********//
interface DemoInterface{
			public void method1();
		}
		interface DemoInterface2{
			public void method2();
		}

public class MainDemointerfaceAnupSir implements DemoInterface,DemoInterface2 {
			public void printAbstract() {
				System.out.println("print abstract 1");
				
			}
			public void printAbstract2() {
				System.out.println("print abstract 2");
			}
			public void printAbstract3() {
				System.out.println("print abstract 3");
			}
			public static void main(String[] args) {
				MainDemointerfaceAnupSir mi=new MainDemointerfaceAnupSir();
				mi.printAbstract();
				mi.printAbstract2();
				mi.printAbstract3();
                mi.method2();
                mi.method1();
			}
			@Override
			public void method2() {
				System.out.println("Hello");
				
			}
			@Override
			public void method1() {
				System.out.println("Hiii Hello");
			}

			

		}
	