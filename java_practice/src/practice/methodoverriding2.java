package practice;

public class methodoverriding2 extends methodoverriding {
public void Dog(String name) {
	System.out.println(name);
}
public static void main(String args[]) {
	methodoverriding2 m=new methodoverriding2();
	m.Dog("papi");
	methodoverriding m1=new methodoverriding2();
	m1.Dog("raju");
	
	
}
}
