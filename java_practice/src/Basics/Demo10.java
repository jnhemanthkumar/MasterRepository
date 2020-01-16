package Basics;

import java.util.Scanner;

public class Demo10 {
public static boolean isprime(int num) {
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;	
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	for(int num=2;num<=limit;num++ ) {
		if(isprime(num)) {
			System.out.println(num);
		}
	}
}
}
