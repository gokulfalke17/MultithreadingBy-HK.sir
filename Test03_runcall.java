package gf.multithreading;

class MyThread05 extends Thread {
	@Override
	public void run() {
		for(int i=50;i>=1;i--) {
			System.out.println("run i : "+i);
		}
	}
}
	
public class Test03_runcall	 {
	public static void main(String[] args) {
		
		MyThread05 mt1 = new MyThread05();
		//mt1.start();
		mt1.run();
		for(int i=1;i<=50;i++) {
			System.out.println("main i : "+i);
		}
	}

}
