package test;


interface Demo{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

abstract class AdapterImpl implements Demo{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("bye");
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}
	
}

class DemoImpl extends AdapterImpl{
	public void m3() {
		System.out.println("hello");
	}
}


public class Practice {
//	static int a=10;
//	int b=5;
//	
	
 public static void main(String[] args) {
//	System.out.println(a);
//	Practice p=new Practice();
//	System.out.println(p.b);
//	System.out.println(a+p.b);
//	String s="cvv";
//	String str="one";
//	str.concat("two");
//	String str1 = str.concat("three");
//	System.out.println(str1);
	 
	 DemoImpl demo = new DemoImpl();
	 
	 demo.m3();
	 demo.m4();
	
}
}
