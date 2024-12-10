package gf.multithreading;

import java.util.concurrent.Callable;

class ExRunnable implements Runnable {
	
	public void run() {
		System.out.println("ExRunnable run executed");
	}
}

class ExThread extends Thread {
	@Override
	public void run() {
		System.out.println("ExTread run executed");
	}
}

class ExCallable implements Callable<Integer> {
	@Override
	public Integer call() {
		System.out.println("ExCallable call executed");
		return 5;
	}
}
public class Test32_Callable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ExRunnable());
		t1.start();
		
		ExThread t2 = new ExThread();
		t2.start();
		
//		ExCallable t3 = new ExCallable();
//		t3.start();
		
		
	}

}
