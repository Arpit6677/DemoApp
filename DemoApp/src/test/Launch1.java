package test;

interface Test{
	void disp();
	void add(int a,int b);
}

interface Test2{
	int demo();
}
public class Launch1{
	
	public static void main(String[] args) {
		Test d=new Test() {

			public void disp() {
				System.out.println("hello");
			}
			public void add(int a,int b) {
				int c=a+b;
				System.out.println(c);
			}
		};
		d.disp();
		d.add(10, 20);
		Test2 t2=new Test2() {
			public int demo() {
				System.out.println("bye");
				return 10;
			}
		};
		 t2.demo();
		
	}

}
