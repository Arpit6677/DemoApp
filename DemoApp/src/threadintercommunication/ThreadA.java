package threadintercommunication;

public class ThreadA extends Thread {
  
	int total=0;
	
	public void run() {
		
		synchronized (ThreadA.class) {
			System.out.println("child thread started calculation");//step-2
		
		 for (int i = 0; i <=100; i++) {
			 total+=i;
			 
		}
		 System.out.println(Thread.currentThread().getName());
		 System.out.println("child thread giving notification call");//step-3
		 ThreadA.class.notify();
		}
		 
	}
	 
}
