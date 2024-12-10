package gf.multithreading;

public class DaemonDemo implements Runnable{
	Thread th;
	
	public DaemonDemo() {
		th = new Thread();
		th.setDaemon(true);	
		th.start();
		
		//th.setDaemon(true);
	}
	
	@Override
	public void run() {
		System.out.println("Run : ");
		for(int i=1;i<=100;i++) {
			System.out.println("Run : "+ i);
		}
	}
	

	public static void main(String[] args) {
		
		DaemonDemo dd = new DaemonDemo();
		
		System.out.println("Baba countDown starts ");
		
		for(int i=1;i<=5;i++) {
			System.out.println("main : "+i);
		}

	}

	

}
