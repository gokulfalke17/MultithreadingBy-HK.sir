package gf.multithreading;

class MyThread07 extends Thread {
	@Override
	public void run() {
		System.out.println("In run() method");
	}
}
class Test05_threadstartcall {
	public static void main(String[] args) {
		System.out.println("In main() method");
		Thread t = new Thread();
		t.start();
	}

}
