package practice;

public class subclass2 extends subclass1 {
public void method6() {
	System.out.println("subclass2");
}
public static void main(String args[]) {
	subclass2 s=new subclass2();
	s.method1();
	s.method2();
	s.method3();
	s.method4();
	s.method5();
	s.method6();
}
}
