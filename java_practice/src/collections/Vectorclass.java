package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorclass {
public static void main(String args[]) {
	//synchronized 
	// legecy class in collectin
	// we have to enumatation corcer instead of iterator
	Vector<Integer> v=new Vector<Integer>();
	v.addElement(100);
	v.addElement(200);
	v.addElement(300);
	v.addElement(400);
	v.addElement(500);
	Enumeration<Integer> en=v.elements();
	while(en.hasMoreElements()) {
		int elements=en.nextElement();
		System.out.println(elements);
	}

}
}
