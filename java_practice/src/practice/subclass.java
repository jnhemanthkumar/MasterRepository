package practice;

public class subclass extends superclass {
public void method3() {
	System.out.println("Method3");
}
public void method4() {
	System.out.println("Method4");
}
public static void main(String args[]) {
	superclass s=new subclass();
	s.method1();
	s.method2();
	subclass s1=new subclass();
	s1.method3();
	s1.method4();
}
}
