package collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashmapclassdd {
	public static void main(String args[]) {
HashMap<Integer, String >map=new HashMap<Integer, String>();
map.put(1, "hemanth");
map.put(2, "mubarak");
map.put(3, "Lavanya");
Iterator<Integer> it=map.keySet().iterator();
Iterator<String> it1=map.values().iterator();
while(it1.hasNext()) {
	String values=it1.next();
	System.out.println(values);
}
while(it.hasNext()) {
	int keys=it.next();
	System.out.println(keys);
}
for(Map.Entry<Integer, String> entry:map.entrySet()) {
	System.out.println(entry.getKey()+entry.getValue());
	
}

Hashtable<Integer, String> t= new Hashtable<Integer, String>();
t.put(1, "java");
t.put(2,"C++");
Enumeration<Integer> e=t.keys();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}





	}
	

}
