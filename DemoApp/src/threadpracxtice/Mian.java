package threadpracxtice;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Display d=new Display();
     Display d1=new Display();
     
     
     Mythread t=new Mythread(d, "dhoni");
     Mythread t2=new Mythread(d1, "yuvi");
     
     
	 t.setName("dhoni");
	 t2.setName("yuvi");
	 
     t.start();
     t2.start();
	}

}
