package Com.OOPS;

public class Demo1 {
public static void main(String args[]) {
	String s="Hemanth";
	for(int i=s.length()-1;i>=0;i--) {
		System.out.println(s.charAt(i));
	}
	StringBuffer b=new StringBuffer();
	b.append(s);
	System.out.println(b.reverse());
	
}
}
