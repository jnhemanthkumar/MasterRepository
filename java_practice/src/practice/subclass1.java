package practice;

public class subclass1 extends subclass {
public void method5() {
	System.out.println("subclass1");
}
public static void main(String args[]) {
	subclass1 s=new subclass1();
	s.method1();
	s.method2();
	s.method3();
	s.method4();
	s.method5();
}
}
