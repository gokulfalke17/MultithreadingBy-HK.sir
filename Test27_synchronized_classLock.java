package gf.multithreading;

class Add02 {
	private int x;
	private int y;
	public synchronized void add(int x, int y) {
	//public void add(int x, int y) {
		System.out.println(Thread.currentThread().getName()+" Start");
		this.x = x;
		this.y = y;
		
		try { 
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int result = x+y;
		System.out.println(Thread.currentThread().getName()+" Result is :: "+result);
		
		System.out.println(Thread.currentThread().getName()+" End");
		
	}
}

class Thread03 extends Thread {
	private Add02 a;
	public Thread03(Add02 a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(70, 80);
	}
}

class Thread04 extends Thread {
	private Add02 a;
	public Thread04(Add02 a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(100, 200);
	}
}

public class Test27_synchronized_classLock {
	public static void main(String[] args) {
		System.out.println("main start");
		Add02 a = new Add02();
		Thread03 t1 = new Thread03(a);
		Thread04 t2 = new Thread04(a);
		
//		Add a1 = new Add();
//		Add a2 = new Add(); 
//		
//		Thread01 t1 = new Thread01(a1); 
//		Thread02 t2 = new Thread02(a2);

		t1.start();
		t2.start();
		

		
		System.out.println("main end");
	}
}
