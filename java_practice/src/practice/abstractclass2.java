package practice;

 class abstractclass2 extends abstracclass{

	@Override
	void m2() {
	System.out.println("abstract method");
		
	}
	public static void main(String args[]) {
		abstractclass2 a=new abstractclass2();
		a.m1();
		a.m2();
	}

}
