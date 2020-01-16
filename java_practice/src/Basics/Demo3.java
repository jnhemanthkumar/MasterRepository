package Basics;

public class Demo3 {
public static void main(String args[]) {
	int num=121;
	int temp=num;
	int rem=0;
	int rev=0;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
	if(temp==rev) {
		System.out.println("Given number is Palindrom");
	}else {
		System.out.println("Given number is not a Palindrom");
	}
}
}
