package collections;

import java.util.Enumeration;
import java.util.Stack;

public class stackclass {
public static void main(String args[]) {
	Stack<Integer> it=new Stack<Integer>();
	it.push(100);
	it.push(200);
	it.push(300);
	it.pop();
	System.out.println(it.peek());
	Enumeration<Integer> en=it.elements();
	while(en.hasMoreElements()) {
		int elements=en.nextElement();
		System.out.println(elements);
	}
}
}
