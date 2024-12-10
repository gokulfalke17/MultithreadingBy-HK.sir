package gf.multithreading;

class MyThread8 extends Thread {
	@Override
	public void run() {
		for(int i=50;i>=1;i--) {
			System.out.println("run i : "+i);
		}
	}
}

public class Test08_StartMultipleTimes {
	public static void main(String[] args) {
		
		MyThread8 mt1 = new MyThread8();
		mt1.start();
		//mt1.start();//IllegalThreadStateException
		for(int i=1;i<=50;i++) {
			System.out.println("main i : "+i);
		}
	}

}
