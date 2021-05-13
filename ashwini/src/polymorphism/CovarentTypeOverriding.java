package polymorphism;
//in overriding no must argument is same in new java feature we can change
// the augment but that argument must be covariant type
public class CovarentTypeOverriding {
	 Object sum(int a , float b) {
		System.out.println("minmin");
		return 0;
	}
	 int sum1(int a,Object b) {
		System.out.println("shreya");
		return 0;
	}
}
	class  CovarentTypeOverriding2 extends  CovarentTypeOverriding {
		 String sum(int a , float b) {
			System.out.println("ashwini");
			return null;
		}
	    void sum1(int a,float b) {
			System.out.println("sweety");
		}

	public static void main(String[] args) {
		 CovarentTypeOverriding sc = new  CovarentTypeOverriding();
		 sc.sum(10,10.2f);
		  sc.sum1(10,"ash");
		  CovarentTypeOverriding2 as = new  CovarentTypeOverriding2();
		  as.sum(10,50.6f);
		  as.sum1(20,10.2f);
	}

}
