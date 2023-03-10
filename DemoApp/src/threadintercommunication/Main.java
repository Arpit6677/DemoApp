package threadintercommunication;

public class Main  {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		ThreadA t=new ThreadA();
		t.start();
		t.setName("child thread");
		
		synchronized (t) {
			Thread.currentThread().setName("main thread");
			System.out.println(Thread.currentThread().getName());
			System.out.println("main thread calling wait() method");//step-1
		     t.wait();
		     System.out.println("main thread got notification call");//step-4
		   System.out.println(t.total);
		}
	}

}
