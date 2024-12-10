package gf.multithreading;

 class MyThread04 extends Thread {
	@Override
	public void run() {
		for(int i=50;i>=1;i--) {
			System.out.println("run i : "+i);
		}
	}
}
 public class Test02_print1to2020to1 {	
	public static void main(String[] args) {
		
		MyThread04 mt1 = new MyThread04();
		mt1.start();
		for(int i=1;i<=50;i++) {
			System.out.println("main i : "+i);
		}
	}

}
