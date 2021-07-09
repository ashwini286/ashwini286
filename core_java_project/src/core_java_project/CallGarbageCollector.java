package core_java_project;
// u can call garbage collector of jvm to delete any unused variable and unreferenced objects from memory using
//gc(); method. this gc() method appears in both runtime and system classes of java.lang package for ex:- 
//System.gc();
//Runtime.getRuntime.gc();
public class CallGarbageCollector {

public static void main(String[] args) {
	System.gc();
	Runtime.getRuntime().gc();
}
}
