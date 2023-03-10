package threadpracxtice;

public class Display {

	public void wish(String name) {
		 ;;;;;;;;;;//1lakh lines of code
		 
		 //lock of class level,so only thread can access this region as it is critical
		 synchronized (Display.class) {
			System.out.println("Thread is getting lock is: "+Thread.currentThread().getName());
		 
			for (int i = 1; i <=5; i++) {
				System.out.print("Good morning:");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(name);
			}
		
		 }
		 System.out.println("Thread which is releasing the lock: " +Thread.currentThread().getName());
        ;;;;;;;;;;;;;;//1-lakh lines of code
	}
}
