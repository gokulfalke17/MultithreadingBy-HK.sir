package gf.multithreading;

class MyThread06 extends Thread {
	@Override
	public void run() {
		for(int i=50;i>=1;i--) {
			System.out.println("run i : "+i);
		}
	}
}
public class Test04_bothstartandruncall	{
	public static void main(String[] args) {
		
		MyThread06 mt1 = new MyThread06();
		//mt1.run();
		mt1.start();
		mt1.run();
		for(int i=1;i<=50;i++) {
			System.out.println("main i : "+i);
		}
	}

}
