package Basics;

public class Demo6 {
public static void main(String args[]) {
	int num=6;
	int count=0;
	for(int i=2;i<num;i++) {
 if(num%i==0) {
	 count++;
	 break;
 }
	}
	System.out.println(count);
	if(count==0) {
		System.out.println("Given number is prime number");
	}else {
		System.out.println("Given number is not a prime number");
	}
}
}
