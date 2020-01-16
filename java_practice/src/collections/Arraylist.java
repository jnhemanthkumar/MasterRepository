package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist {
public static void main(String args[]) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(100);
	arr.add(200);
	arr.add(300);
	for(int a:arr) {
		System.out.println(a);
	}
	Iterator<Integer> it=arr.iterator();
	while(it.hasNext()) {
		int elements=it.next();
		System.out.println(elements);
	}
	
	LinkedList<Integer> list=new  LinkedList<Integer>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	
	for(int l:list) {
		System.out.println(l);
	}
	list.addFirst(1000);
	list.addLast(2000);
	Iterator<Integer> it1=list.iterator();
	while(it1.hasNext()) {
		int elements=it1.next();
		System.out.println(elements);
	}
	
	
	
	
}
}
