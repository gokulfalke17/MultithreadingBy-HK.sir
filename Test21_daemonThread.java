package gf.multithreading;

class MyThread12 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println("run i : "+i);
		}
	}
}
public class Test21_daemonThread {

	public static void main(String[] args) {
		
		System.out.println("main start"); 
		
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		
		Thread t2 = new Thread();
		System.out.println(t2.isDaemon());
		
		t2.setDaemon(true);
		System.out.println(t2.isDaemon());
		
		MyThread12 mt1 = new MyThread12();
		System.out.println(mt1.isDaemon());
		
		mt1.setDaemon(true);
		mt1.start();
		//mt1.setDaemon(true); //IllegalThreadStateException ---> it daemon must be in before calling
		
		for(int i=20;i>=1;i--) {
			System.out.println("in main i :"+i);
		}
		
		
		System.out.println("main end");

	}

}
