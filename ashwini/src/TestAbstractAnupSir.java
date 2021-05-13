
public class TestAbstractAnupSir {
//	public class TestAbstract {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Audi audi=new Audi();
			Ferrari fer=new Ferrari();
			
			audi.engine();
			audi.wheels();
			
			fer.engine();
			fer.wheels();


		}

	}

abstract class Car{
		public  abstract  void engine();  
		public void wheels() {
			
			System.out.println("wheel : 4");
		};	
		
	}

	class Audi extends Car{

		@Override
		public void engine() {
			// TODO Auto-generated method stub
			System.out.println("Audi Engine");
			
			
		}
		
	}

	class Ferrari extends Car{

		@Override
		public void engine() {
			// TODO Auto-generated method stub
			System.out.println("Ferrari Engine");
			
		}
		
	}

