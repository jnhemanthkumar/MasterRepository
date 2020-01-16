package collections;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
public static void main(String args[]) {
	
TreeSet<Integer> it=new TreeSet<Integer>();
it.add(100);
it.add(200);
it.add(300);
it.add(400);
// if we want to retrive the elements less then that particular element we can use headset
System.out.println(it.headSet(300));
}
	

}
