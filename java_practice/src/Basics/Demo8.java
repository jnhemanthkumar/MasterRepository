package Basics;

public class Demo8 {
public static void main(String args[]) {
int total=0;
for(int num=1;num<=10;num++) {
	if(num==1) {
		total++;
	}

int count=0;
for(int i=2;i<=num/2;i++) {
	if(num%i==0) {	
		count++;
	}
}
if(count==1) {
	total++;
}
}
System.out.println(total);
}
}
