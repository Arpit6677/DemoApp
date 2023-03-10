package collection;
class Final{
	public static void same() {
//		disp();
	}
	
	public Final(int c) {
		System.out.println("constr");
	}
	
	static {
		System.out.println("static block");
	}
	public void disp(int a) {
		
		try{
		disp(a);
		}catch(Exception e){
		System.out.println("hello");	
		}finally {
			System.out.println("hi");
		}
		
        
	}
}
public class Pdemo {
	
	public void abc() {
		System.out.println("nonm static");
	}
public static void main(String[] args) {
	Pdemo pdemo = new Pdemo();
	pdemo.abc();
	Final f=new Final(20);
	System.out.println(f);
	f.disp(10);
}
}
