package Basics;

public class Demo4 {
public static void main(String args[]) {
	int num=123456;
	int rem=0;
	int sum=0;
	while(num>0) {
		rem=num%10;
		sum=rem+sum;
		num=num/10;
	}
	System.out.println(sum);
}
}
