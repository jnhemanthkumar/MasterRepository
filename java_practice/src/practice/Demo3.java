package practice;

public class Demo3 {
private int age=20;
private String name="Hemanth";
public int getAge() {
	return age;
	
}
public String getName() {
	return name;
}
public void setAge(int age) {
	this.age=age;
}
public void setName(String name) {
	this.name=name;
}
public static void main(String args[]) {
	Demo3 d=new Demo3();
	System.out.println(d.getName());
	System.out.println(d.getAge());
	d.setAge(24);
	d.setName("Hemanth");
}
}
