package Basics;

import java.util.Scanner;

public class Demo12 {
	public static boolean isprime(int num) {
		for(int i=2;i<num;i++ ) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String args[]) {
	int count=0;
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	int sum=0;
	for(int num=2;num<=limit;num++) {
		if(isprime(num)) {
			sum=sum+num;
		}
	}
	System.out.println("sum of the prime numebrs:-"+sum);
}
}
