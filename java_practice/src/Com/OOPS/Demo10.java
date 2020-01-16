package Com.OOPS;

import java.util.HashSet;
import java.util.Set;

public class Demo10 {
public static void main(String args[]) {
	//one way
	int arr[]= {1,2,2,2,2,3,3,4,5};
	Set<Integer> set= new HashSet<Integer>();
	for(int a:arr) {
		if(set.add(a)==false) {
			System.out.println("duplicated"+a);
		}
	}
	//second way
	String a[]={"java","C","java"};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println("Duplicates"+a[i]);
			}
		}
	}
	
	
	
	
}
}
