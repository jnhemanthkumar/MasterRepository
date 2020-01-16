package practice;

public class Methodoverloading {
public void m1(String name,int age) {
	System.out.println(name + age);
}
public void m2(String name,int age,int marks) {
	System.out.println(name + age +marks);
}
public void m3(String name,int age,int marks,String collage) {
	System.out.println(name + age+marks+collage);
}
public static void main(String args[]) {
	Methodoverloading m=new Methodoverloading();
	m.m1("Hemanth",24);
	m.m2("Harish", 25, 100);
	m.m3("Nagesh", 27, 1000, "vishweshwara");
}
}
