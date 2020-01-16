package collections;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetclass {
public static void main(String args[]) {
HashSet<Integer> h=new HashSet<Integer>();
h.add(100);
h.add(200);
h.add(300);
h.add(300);
Iterator<Integer> it=h.iterator();
while(it.hasNext()) {
	int elements=it.next();
	System.out.println(elements);
}
for(int elements:h) {
	System.out.println(elements);
}
int arr[]= {1,2,3,4,4,5,5,5,5,9,6,4,3,10};

HashSet<Integer> h1=new HashSet<Integer>();
for(int a:arr) {
	if(h1.add(a)) {
		System.out.println(a);
	}
}

}
}
