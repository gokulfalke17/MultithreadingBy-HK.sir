package gf.multithreading;

class A1 {
	synchronized void m1(B1 b) {
		System.out.println("m1 start");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		System.out.println("Before b.m3() method calling...");
		b.m4();
		System.out.println("m1 end");
	} 
	
	synchronized void m2() {
		System.out.println("A1 m2() method executed...");
	}
}

class B1 {
	synchronized void m3(A1 a) {
		System.out.println("m3 start");
		try {
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Before a.m2() method calling...");
		a.m2();
		System.out.println("m3 end");
	}
	
	synchronized void m4() {
		System.out.println("B2 m4() method executed...");
	}
}

class AThread extends Thread {
	private A1 a1;
	private B1 b1;
	public AThread(A1 a1, B1 b1) {
		this.a1 = a1;
		this.b1 = b1;
	}
	
	@Override
	public void run() {
		a1.m1(b1);
	}
}

class BThread extends Thread {
	private B1 b1;
	private A1 a1;
	
	public BThread(B1 b1, A1 a1) {
		this.b1 = b1;
		this.a1 = a1;
	}
	
	@Override
	public void run() {
		b1.m3(a1);
	}
}


public class Test29_DeadLock {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		B1 b1 = new B1();
		
		AThread at1 = new AThread(a1, b1);
		BThread bt1 = new BThread(b1, a1);
		
		at1.start();
		bt1.start();

	}

}
