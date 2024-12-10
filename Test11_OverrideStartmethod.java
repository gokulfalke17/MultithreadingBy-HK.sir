package gf.multithreading;

class MyThread011 extends Thread {
	@Override
	public void run() {
		System.out.println("run");
	}
	@Override
	public void start() {
		System.out.println("start");
		run();
		super.start();
	}
}

public class Test11_OverrideStartmethod {
	public static void main(String[] args) {
		MyThread011 mto = new MyThread011();
		mto.start();
		System.out.println("main");
	}


}
