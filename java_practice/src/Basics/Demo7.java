package Basics;

public class Demo7 {
public static void main(String args[]) {
	int prev=0;
	int next=1;
	int limit=10;
	int feb=0;
	for(int i=1;i<=limit;i++) {
		feb=prev+next;
		System.out.println(feb);
		prev=next;
		next=feb;
		
	}
	
}
}
