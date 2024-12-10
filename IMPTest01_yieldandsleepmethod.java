package gf.multithreading;


/*
 
 sleep() method is to forcing Thread Scheduler to pause
 it is fast then yield() method
 sleep() method give time to other methods to execute
 
 yield() method is to requesting Thread Scheduler to pause
 it is lower then sleep() method
 yield() method give time to its self
  
 */
class A extends Thread {
	
	@Override
	public void run() {
		System.out.println("in run");
		Thread.yield();
	}
}

class B extends Thread {
	@Override
	public void run() {
		System.out.println("in child run method");
		Thread.yield();
	}
}

class C extends Thread {
	@Override
	public void run() {
		System.out.println("in Second run method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class IMPTest01_yieldandsleepmethod {

	public static void main(String[] args) {
		
		System.out.println("main start");
		A a1 = new A();
		a1.start();
		
		B b1 = new B();
		b1.start();
		
		C c1 = new C();
		c1.start();
		
		System.out.println("main end");

	}

}

