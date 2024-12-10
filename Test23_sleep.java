package gf.multithreading;

class MyThread14 extends Thread {
	
	@Override
	public void run() {
		System.out.println("in run");
	}
}

public class Test23_sleep {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main start");
		MyThread14 mt1 = new MyThread14();
		mt1.start();
		
		
		Thread.sleep(5000); //Forcing Thread Scheduler to pause
		
		System.out.println("main end");

	}

}
