package gf.multithreading;

class Add {
	private int x;
	private int y;
	public void add(int x, int y) {
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

class Thread01 extends Thread {
	private Add a;
	public Thread01(Add a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(70, 80);
	}
}

class Thread02 extends Thread {
	private Add a;
	public Thread02(Add a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(100, 200);
	}
}

public class Test26_synchronized {
	public static void main(String[] args) {
		System.out.println("main start");
		Add a = new Add();
		Thread01 t1 = new Thread01(a);
		Thread02 t2 = new Thread02(a);
		

		t1.start();
		t2.start();
		

		
		System.out.println("main end");
	}
}
