package practice;

public class Demo2 extends Demo implements Demo1 {

	Demo2(String name, int age, String village) {
		super(name, age, village);
System.out.println(name+age+village);
	}

	@Override
	public void method1() {
	System.out.println("Method1");
		
	}

	@Override
	public void method2() {
		System.out.println("Method2");
		
	}

	@Override
	public void method3() {
		System.out.println("Method3");
		
	}

	@Override
	public void method4() {
		System.out.println("Method4");
		
	}
	public static void main(String args[]) {
		Demo2 d=new Demo2("Harish", 24, "name");
		d.method1();
		d.method2();
		d.method3();
		d.method4();
	}

}
