package gf.multithreading;

class MyThread13 extends Thread {
	
	@Override
	public void run() {
		System.out.println("in run");
		
	}
}

public class Test22_yield {

	public static void main(String[] args) {
		
		System.out.println("main start");
		MyThread13 mt1 = new MyThread13();
		mt1.start();
		
		Thread.yield(); //requesting Thread Scheduler
		
		System.out.println("main end");

	}

}
