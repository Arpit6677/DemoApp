package test;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
//			Thread.yield();
			System.out.println("child  thread");

		}

	}
}

public class A {
	public static void main(String[] args) {
//	Integer i=3;
		MyThread t = new MyThread();
//		Thread t1 = new Thread();
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread");

		}
	}
}
