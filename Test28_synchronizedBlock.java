package gf.multithreading;

class Add03 {
	private int x;
	private int y;
	public synchronized void add(int x, int y) {
	//public void add(int x, int y) {
		System.out.println(Thread.currentThread().getName()+" Start");
		
		synchronized (Add03.class) {
			
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
			System.out.println();
		}
	}
}

class Thread05 extends Thread {
	private Add03 a;
	public Thread05(Add03 a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(70, 80);
	}
}

class Thread06 extends Thread {
	private Add03 a;
	public Thread06(Add03 a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		a.add(100, 200);
	}
}

public class Test28_synchronizedBlock {
	public static void main(String[] args) {
		System.out.println("main start");
		Add03 a = new Add03();
		Thread05 t1 = new Thread05(a);
		Thread06 t2 = new Thread06(a);
		

		t1.start();
		t2.start();
		

		
		System.out.println("main end");
	}
}
